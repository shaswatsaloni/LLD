package problems.inmemdb.repository.entities;

import problems.inmemdb.common.enums.TypeEnum;

public class Column {
    private String colName;
    private TypeEnum colType;
    private Object colValue;

    public Column(String colName, TypeEnum colType, Object colValue){
        this.colName = colName;
        this.colType = colType;
        this.colValue = colValue;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public TypeEnum getColType() {
        return colType;
    }

    public void setColType(TypeEnum colType) {
        this.colType = colType;
    }

    public Object getColValue() {
        return colValue;
    }

    public void setColValue(Object colValue) {
        this.colValue = colValue;
    }
}
