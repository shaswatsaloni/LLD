package problems.inmemdb.repository.entities;

import java.util.Map;

public class Row {
    private Integer rowId;
    private Map<Column, Object> data;

    public Row(Integer rowId, Map<Column, Object> data){
        this.rowId = rowId;
        this.data = data;
    }


    public Integer getRowId() {
        return rowId;
    }

    public void setRowId(Integer rowId) {
        this.rowId = rowId;
    }

    public Map<Column, Object> getData() {
        return data;
    }

    public void setData(Map<Column, Object> data) {
        this.data = data;
    }
}
