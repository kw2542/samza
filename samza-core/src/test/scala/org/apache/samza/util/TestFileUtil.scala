/*
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.samza.util

import java.io.{File, FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream}

import org.junit.Assert.{assertEquals, assertNull, assertTrue}
import org.junit.Test

class TestFileUtil {
  val data = "100"
  val checksum = FileUtil.getChecksum(data)
  val file = new File(System.getProperty("java.io.tmpdir"), "test")

  @Test
  def testWriteDataToFile() {
    // Invoke test
    FileUtil.writeWithChecksum(file, data)

    // Check that file exists
    assertTrue("File was not created!", file.exists())
    val fis = new FileInputStream(file)
    val ois = new ObjectInputStream(fis)

    // Check content of the file is as expected
    assertEquals(checksum, ois.readLong())
    assertEquals(data, ois.readUTF())
    ois.close()
    fis.close()
  }

  @Test
  def testReadDataFromFile() {
    // Setup
    val fos = new FileOutputStream(file)
    val oos = new ObjectOutputStream(fos)
    oos.writeLong(checksum)
    oos.writeUTF(data)
    oos.close()
    fos.close()

    // Invoke test
    val result = FileUtil.readWithChecksum(file)

    // Check data returned
    assertEquals(data, result)
  }

  @Test
  def testReadInvalidDataFromFile() {
    // Write garbage to produce a null result when it's read
    val fos = new FileOutputStream(file)
    val oos = new ObjectOutputStream(fos)
    oos.writeLong(1)
    oos.writeUTF("Junk Data")
    oos.close()
    fos.close()

    // Invoke test
    val result = FileUtil.readWithChecksum(file)

    // Check data returned
    assertNull(result)
  }
}