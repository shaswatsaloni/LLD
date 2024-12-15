package problems.inmemdb.repository.entities;

import problems.inmemdb.common.enums.TypeEnum;

public class Column {
    private String colName;
    private TypeEnum colType;

    public Column(String colName, TypeEnum colType){
        this.colName = colName;
        this.colType = colType;
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
}
