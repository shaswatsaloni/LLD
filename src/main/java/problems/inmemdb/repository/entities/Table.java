package problems.inmemdb.repository.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Table {
    private String tableName;
    private Integer autoIncrementId;
    List<Row> rows = new ArrayList<Row>();

    public Table(String tableName) {
        this.autoIncrementId = 1;
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
