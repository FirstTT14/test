package model;

public abstract class Member {
    protected String id;
    protected String firstName;
    protected String lastName;
    protected String memberClass;
    protected String email;
    protected String phone;

    public Member(String id, String firstName, String lastName,
                  String memberClass, String email, String phone) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberClass = memberClass;
        this.email = email;
        this.phone = phone;
    }

    public String getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getMemberClass() { return memberClass; }
    public String getEmail() { return email; }
    public String getPhone() { return phone; }
}
