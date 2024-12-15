package problems.inmemdb.service;

import problems.inmemdb.repository.entities.Column;
import problems.inmemdb.repository.entities.Row;

import java.util.List;
import java.util.Map;

public interface ITableService {
    //this is to set the column value with the help of a map.
    void populateColumnMap(List<Column> cols);

    //Insert a row in the table
    void insertRow(Map<Column, Object> colValues, String tableName);

    //print a row of the table
    void printRows(String tableName);

    void printRecords(List<Row> rows);

    void truncateRows();

    void getRecordsByColumnValue(Column column, Object value, String tableName);

    boolean checkIfColnExists(String colName, String tableName);
}
