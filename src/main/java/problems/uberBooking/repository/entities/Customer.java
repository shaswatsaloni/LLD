package problems.uberBooking.repository.entities;

import problems.uberBooking.common.UserType;

public class Customer extends BaseUser{
    public Customer(String id, String name, Integer mobNo, UserType userType){
        super(id, name, mobNo, userType);
    }
}
