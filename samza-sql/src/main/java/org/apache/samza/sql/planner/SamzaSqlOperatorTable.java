/*
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
*/

package org.apache.samza.sql.planner;

import org.apache.calcite.sql.SqlAggFunction;
import org.apache.calcite.sql.SqlAsOperator;
import org.apache.calcite.sql.SqlBinaryOperator;
import org.apache.calcite.sql.SqlFunction;
import org.apache.calcite.sql.SqlOperator;
import org.apache.calcite.sql.SqlPostfixOperator;
import org.apache.calcite.sql.SqlPrefixOperator;
import org.apache.calcite.sql.SqlSpecialOperator;
import org.apache.calcite.sql.fun.SqlArrayValueConstructor;
import org.apache.calcite.sql.fun.SqlDatePartFunction;
import org.apache.calcite.sql.fun.SqlMapValueConstructor;
import org.apache.calcite.sql.fun.SqlMultisetQueryConstructor;
import org.apache.calcite.sql.fun.SqlMultisetValueConstructor;
import org.apache.calcite.sql.fun.SqlRowOperator;
import org.apache.calcite.sql.fun.SqlStdOperatorTable;
import org.apache.calcite.sql.util.ReflectiveSqlOperatorTable;


/**
 * List of all operators supported in Samza Sql. This is the subset of all the calcite operators.
 */
public class SamzaSqlOperatorTable extends ReflectiveSqlOperatorTable {

  public static final SqlBinaryOperator AND = SqlStdOperatorTable.AND;
  public static final SqlAsOperator AS = SqlStdOperatorTable.AS;
  public static final SqlBinaryOperator CONCAT = SqlStdOperatorTable.CONCAT;
  public static final SqlBinaryOperator DIVIDE = SqlStdOperatorTable.DIVIDE;
  public static final SqlBinaryOperator EQUALS = SqlStdOperatorTable.EQUALS;
  public static final SqlBinaryOperator GREATER_THAN = SqlStdOperatorTable.GREATER_THAN;
  public static final SqlBinaryOperator GREATER_THAN_OR_EQUAL = SqlStdOperatorTable.GREATER_THAN_OR_EQUAL;
  public static final SqlBinaryOperator IN = SqlStdOperatorTable.IN;
  public static final SqlBinaryOperator NOT_IN = SqlStdOperatorTable.NOT_IN;
  public static final SqlBinaryOperator LESS_THAN = SqlStdOperatorTable.LESS_THAN;
  public static final SqlBinaryOperator LESS_THAN_OR_EQUAL = SqlStdOperatorTable.LESS_THAN_OR_EQUAL;
  public static final SqlBinaryOperator MINUS = SqlStdOperatorTable.MINUS;
  public static final SqlBinaryOperator MULTIPLY = SqlStdOperatorTable.MULTIPLY;
  public static final SqlBinaryOperator NOT_EQUALS = SqlStdOperatorTable.NOT_EQUALS;
  public static final SqlBinaryOperator OR = SqlStdOperatorTable.OR;
  public static final SqlBinaryOperator PLUS = SqlStdOperatorTable.PLUS;

  public static final SqlPostfixOperator IS_NOT_NULL = SqlStdOperatorTable.IS_NOT_NULL;
  public static final SqlPostfixOperator IS_NULL = SqlStdOperatorTable.IS_NULL;
  public static final SqlPostfixOperator IS_NOT_TRUE = SqlStdOperatorTable.IS_NOT_TRUE;
  public static final SqlPostfixOperator IS_TRUE = SqlStdOperatorTable.IS_TRUE;
  public static final SqlPostfixOperator IS_NOT_FALSE = SqlStdOperatorTable.IS_NOT_FALSE;
  public static final SqlPostfixOperator IS_FALSE = SqlStdOperatorTable.IS_FALSE;
  public static final SqlPostfixOperator IS_EMPTY = SqlStdOperatorTable.IS_EMPTY;
  public static final SqlPostfixOperator IS_NOT_EMPTY = SqlStdOperatorTable.IS_NOT_EMPTY;

  public static final SqlOperator ITEM = SqlStdOperatorTable.ITEM;
  public static final SqlOperator DOT = SqlStdOperatorTable.DOT;
  public static final SqlFunction ELEMENT = SqlStdOperatorTable.ELEMENT;

  public static final SqlPrefixOperator EXISTS = SqlStdOperatorTable.EXISTS;
  public static final SqlPrefixOperator NOT = SqlStdOperatorTable.NOT;
  public static final SqlPrefixOperator UNARY_MINUS = SqlStdOperatorTable.UNARY_MINUS;
  public static final SqlPrefixOperator UNARY_PLUS = SqlStdOperatorTable.UNARY_PLUS;
  public static final SqlPrefixOperator EXPLICIT_TABLE = SqlStdOperatorTable.EXPLICIT_TABLE;

  public static final SqlSpecialOperator LIKE = SqlStdOperatorTable.LIKE;
  public static final SqlSpecialOperator NOT_LIKE = SqlStdOperatorTable.NOT_LIKE;
  public static final SqlSpecialOperator NOT_SIMILAR_TO = SqlStdOperatorTable.NOT_SIMILAR_TO;
  public static final SqlSpecialOperator SIMILAR_TO = SqlStdOperatorTable.SIMILAR_TO;

  public static final SqlFunction OVERLAY = SqlStdOperatorTable.OVERLAY;
  public static final SqlFunction POSITION = SqlStdOperatorTable.POSITION;
  public static final SqlFunction CHARACTER_LENGTH = SqlStdOperatorTable.CHARACTER_LENGTH;
  public static final SqlFunction INITCAP = SqlStdOperatorTable.INITCAP;
  public static final SqlFunction TRUNCATE = SqlStdOperatorTable.TRUNCATE;
  public static final SqlFunction COALESCE = SqlStdOperatorTable.COALESCE;
  public static final SqlFunction CHAR_LENGTH = SqlStdOperatorTable.CHAR_LENGTH;
  public static final SqlFunction SUBSTRING = SqlStdOperatorTable.SUBSTRING;
  public static final SqlFunction REPLACE = SqlStdOperatorTable.REPLACE;
  public static final SqlFunction TRIM = SqlStdOperatorTable.TRIM;
  public static final SqlFunction UPPER = SqlStdOperatorTable.UPPER;
  public static final SqlFunction LOWER = SqlStdOperatorTable.LOWER;


  public static final SqlFunction CARDINALITY = SqlStdOperatorTable.CARDINALITY;

  public static final SqlMultisetValueConstructor MULTISET_VALUE = SqlStdOperatorTable.MULTISET_VALUE;
  public static final SqlMultisetQueryConstructor MULTISET_QUERY = SqlStdOperatorTable.MULTISET_QUERY;
  public static final SqlMultisetQueryConstructor ARRAY_QUERY = SqlStdOperatorTable.ARRAY_QUERY;
  public static final SqlArrayValueConstructor ARRAY_VALUE_CONSTRUCTOR = SqlStdOperatorTable.ARRAY_VALUE_CONSTRUCTOR;
  public static final SqlMultisetQueryConstructor MAP_QUERY = SqlStdOperatorTable.MAP_QUERY;
  public static final SqlMapValueConstructor MAP_VALUE_CONSTRUCTOR = SqlStdOperatorTable.MAP_VALUE_CONSTRUCTOR;
  public static final SqlRowOperator ROW = SqlStdOperatorTable.ROW;

  public static final SqlFunction POWER = SqlStdOperatorTable.POWER;
  public static final SqlFunction ROUND = SqlStdOperatorTable.ROUND;
  public static final SqlFunction SQRT = SqlStdOperatorTable.SQRT;
  public static final SqlFunction MOD = SqlStdOperatorTable.MOD;
  public static final SqlFunction FLOOR = SqlStdOperatorTable.FLOOR;
  public static final SqlFunction CEIL = SqlStdOperatorTable.CEIL;
  public static final SqlFunction EXTRACT = SqlStdOperatorTable.EXTRACT;

  public static final SqlFunction LOCALTIME = SqlStdOperatorTable.LOCALTIME;
  public static final SqlFunction LOCALTIMESTAMP = SqlStdOperatorTable.LOCALTIMESTAMP;
  public static final SqlFunction CURRENT_TIME = SqlStdOperatorTable.CURRENT_TIME;
  public static final SqlFunction CURRENT_TIMESTAMP = SqlStdOperatorTable.CURRENT_TIMESTAMP;
  public static final SqlFunction CURRENT_DATE = SqlStdOperatorTable.CURRENT_DATE;
  public static final SqlFunction TIMESTAMP_ADD = SqlStdOperatorTable.TIMESTAMP_ADD;
  public static final SqlFunction TIMESTAMP_DIFF = SqlStdOperatorTable.TIMESTAMP_DIFF;

  public static final SqlFunction CAST = SqlStdOperatorTable.CAST;

  public static final SqlDatePartFunction YEAR = SqlStdOperatorTable.YEAR;
  public static final SqlDatePartFunction MONTH = SqlStdOperatorTable.MONTH;
  public static final SqlDatePartFunction QUARTER = SqlStdOperatorTable.QUARTER;
  public static final SqlDatePartFunction WEEK = SqlStdOperatorTable.WEEK;
  public static final SqlDatePartFunction DAYOFYEAR = SqlStdOperatorTable.DAYOFYEAR;
  public static final SqlDatePartFunction DAYOFMONTH = SqlStdOperatorTable.DAYOFMONTH;
  public static final SqlDatePartFunction DAYOFWEEK = SqlStdOperatorTable.DAYOFWEEK;
  public static final SqlDatePartFunction HOUR = SqlStdOperatorTable.HOUR;
  public static final SqlDatePartFunction MINUTE = SqlStdOperatorTable.MINUTE;
  public static final SqlDatePartFunction SECOND = SqlStdOperatorTable.SECOND;

  public static final SqlAggFunction COUNT = SqlStdOperatorTable.COUNT;
  public static final SqlAggFunction SUM = SqlStdOperatorTable.SUM;
  public static final SqlAggFunction SUM0 = SqlStdOperatorTable.SUM0;

  public static final SqlFunction TUMBLE = SqlStdOperatorTable.TUMBLE;
  public static final SqlFunction TUMBLE_END = SqlStdOperatorTable.TUMBLE_END;
  public static final SqlFunction TUMBLE_START = SqlStdOperatorTable.TUMBLE_START;

  public SamzaSqlOperatorTable() {
    init();
  }
}
