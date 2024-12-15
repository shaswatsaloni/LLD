package problems.inmemdb;

import problems.inmemdb.common.enums.TypeEnum;
import problems.inmemdb.repository.entities.Column;
import problems.inmemdb.service.IDatabaseService;
import problems.inmemdb.service.impl.DatabaseService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    private static final String tableName = "Employee";
    private Map<String, Column> colMap = new HashMap();
    public static void main(String [] strings){
        Column name = new Column("name", TypeEnum.String);
        Column age = new Column("age", TypeEnum.Integer);
        Column salary = new Column("salary", TypeEnum.Integer);
        IDatabaseService db = new DatabaseService();

        List<Column> columns = new ArrayList<>();
        columns.add(name);
        columns.add(age);
        columns.add(salary);
        db.createTableInDatabase(tableName,columns);

        Map<Column,Object> columnValues = new HashMap<>();
        columnValues.put(name, "John");
        columnValues.put(age, 25);
        columnValues.put(salary, 10000);

        db.insertTableData(tableName,columnValues);

        columnValues.clear();
        columnValues.put(name, "Kim");
        columnValues.put(age, 28);
        columnValues.put(salary, 12000);

        db.insertTableData(tableName,columnValues);
        db.printTableAllRows(tableName);

//        ----------------------------------------------------------------------------- //
        db.filterTableRecordsByColumnValueInDb(tableName, age, 28);

        db.filterTableRecordsByColumnValueInDb(tableName, name, "John");
        db.truncate(tableName);
        db.dropTableFromDatabase(tableName);
        db.printTableAllRows(tableName);
    }
}
