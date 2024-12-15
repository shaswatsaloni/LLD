package problems.inmemdb.service;

import problems.inmemdb.repository.entities.Column;

import java.util.List;
import java.util.Map;

public interface IDatabaseService {
    void createTableInDatabase(String tableName, List<Column> columns);

    void dropTableFromDatabase(String tableName);

    void truncate(String tableName);

    void insertTableData(String tableName, Map<Column, Object> columnValues);

    void printTableAllRows(String tableName);

    void filterTableRecordsByColumnValueInDb(String tableName, Column column, Object value);
}
