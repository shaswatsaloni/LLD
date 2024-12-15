package problems.inmemdb.service.impl;

import problems.inmemdb.repository.entities.Column;
import problems.inmemdb.repository.entities.Table;
import problems.inmemdb.service.IDatabaseService;
import problems.inmemdb.service.ITableService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseService implements IDatabaseService {

    private final Map<String, Table> dbTableMap = new HashMap<>();
    private final ITableService tableService;

    public DatabaseService() {
        tableService = new TableService();
    }

    @Override
    public void createTableInDatabase(String tableName, List<Column> columns) {
        if (checkIfTableExistsInDb(tableName)) System.out.println("TableName: " + tableName + " already exists!");
        Table table = new Table(tableName);
        tableService.populateColumnMap(columns);
        dbTableMap.put(tableName, table);
    }

    private boolean checkIfTableExistsInDb(String tableName) {
        if (!dbTableMap.containsKey(tableName)) {
            System.out.println("TableName: " + tableName + " does not exists");
            return false;
        }
        return true;
    }

    @Override
    public void dropTableFromDatabase(String tableName) {
        if (!checkIfTableExistsInDb(tableName)) return;
        dbTableMap.remove(tableName);
        System.out.println("TableName: " + tableName + " dropped!");
    }

    @Override
    public void truncate(String tableName) {
        if (!checkIfTableExistsInDb(tableName)) return;
        tableService.truncateRows();
    }

    @Override
    public void insertTableData(String tableName, Map<Column, Object> columnValues) {
        if (!checkIfTableExistsInDb(tableName)) return;
        dbTableMap.get(tableName);
        tableService.insertRow(columnValues, tableName);
    }

    @Override
    public void printTableAllRows(String tableName) {
        if (!checkIfTableExistsInDb(tableName)) return;
        dbTableMap.get(tableName);
        tableService.printRows(tableName);
    }

    @Override
    public void filterTableRecordsByColumnValueInDb(String tableName, Column column, Object value) {
        if (!checkIfTableExistsInDb(tableName)) return;
        dbTableMap.get(tableName);
        tableService.getRecordsByColumnValue(column, value, tableName);
    }
}
