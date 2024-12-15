package problems.inmemdb.service.impl;

import problems.inmemdb.repository.entities.Column;
import problems.inmemdb.repository.entities.Row;
import problems.inmemdb.service.ITableService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TableService implements ITableService {
    private Integer autoIncrementId = 1;
    List<Row> rows = new ArrayList<Row>();
    private Map<String, Column> colMap = new HashMap();

    @Override
    //this is to set the column value with the help of a map.
    public void populateColumnMap(List<Column> cols) {
        for (Column col : cols) {
            colMap.put(col.getColName(), col);
        }
    }

    //Insert a row in the table
    @Override
    public synchronized void insertRow(Map<Column, Object> colValues, String tableName) {
        //first will check if this coln present in the table.
        for (Column col : colValues.keySet()) {
            if (!checkIfColnExists(col.getColName(), tableName)) {
                return;
            }
        }
        Integer rowId = autoIncrementId++;
        Map<Column, Object> colData = new HashMap(colValues);
        Row row = new Row(rowId, colData);
        this.rows.add(row);

    }

    @Override
    //print a row of the table
    public void printRows(String tableName) {
        System.out.println("Printing all the rows for the table" + tableName);
        printRecords(this.rows);
    }

    @Override
    public void printRecords(List<Row> rows) {
        System.out.print("\t");
        System.out.println("Id  |  age   |  name   |    salary\n");

        //Now to print the values
        //for every row, there is a columnMap which is a Map of <Column and Object>
        for (Row row : rows) {
            System.out.print("\t" + row.getRowId() + "\t");
            for (Map.Entry<Column, Object> entry : row.getData().entrySet()) {
                System.out.print("\t" + entry.getValue() + "\t");
            }
            System.out.print("\n");
        }
    }

    @Override
    public void truncateRows() {
        this.rows.clear();
    }

    @Override
    public void getRecordsByColumnValue(Column column, Object value, String tableName) {
        List<Row> rows = new ArrayList();
        for (Row row : this.rows) {
            Object columnValue = row.getData().get(column);
            if (columnValue.equals(value)) {
                rows.add(row);
            }
        }
        System.out.println("Printing matching rows for Table: " + tableName);
        printRecords(rows);
    }

    @Override
    public boolean checkIfColnExists(String colName, String tableName) {
        if (!colMap.containsKey(colName)) {
            System.out.println(colName + "doesn't exist in the " + tableName);
            return false;
        } else {
            return true;
        }
    }
}
