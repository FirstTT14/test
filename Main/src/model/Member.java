package model;

public abstract class Member {
    protected String id;
    protected String firstName;
    protected String lastName;
    protected String memberClass;

    public Member(String id, String firstName, String lastName, String memberClass) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.memberClass = memberClass;
    }

    public String getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getMemberClass() { return memberClass; }
}
