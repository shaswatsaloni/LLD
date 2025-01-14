package problems.uberBooking.repository.entities;

import problems.splitwise.models.User;
import problems.uberBooking.common.UserType;

public class BaseUser {
    private String id;
    private Integer mobNo;
    private String name;
    private UserType userType;

    public BaseUser(String id, String name, Integer mobNo, UserType userType){
        this.id = id;
        this.name = name;
        this.mobNo = mobNo;
        this.userType = userType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getMobNo() {
        return mobNo;
    }

    public void setMobNo(Integer mobNo) {
        this.mobNo = mobNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
