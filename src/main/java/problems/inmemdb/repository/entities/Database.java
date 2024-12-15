package problems.inmemdb.repository.entities;

public class Database {
    private String dbName;

    public Database(String name){
        this.dbName = name;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }
}
