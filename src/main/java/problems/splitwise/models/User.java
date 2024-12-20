package problems.splitwise.models;

public class User {
    private String id;
    private String name;
    private String email;
    private String mobNo;

    public User(String id, String name, String email, String mobNo){
        this.id = id;
        this.name = name;
        this.email = email;
        this.mobNo = mobNo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
