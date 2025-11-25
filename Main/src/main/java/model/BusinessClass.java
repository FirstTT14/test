package model;

public class BusinessClass extends Member {
    public BusinessClass(String id, String firstName, String lastName,
                         String email, String phone) {

        super(id, firstName, lastName, "Business", email, phone);
    }
}
