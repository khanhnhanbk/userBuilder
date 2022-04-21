import java.sql.Date;

public class UserBuilder {

    private final String firstName; // required
    private final String lastName; // required
    private final String phone; // required

    private String email; // optional
    private int age; // optional
    private Date dateOfBirth; // optional
    private String gender; // optional
    private String education; // optional
    private String hometown; // optional
    private String relationshipStatus; // optional

    UserBuilder(String firstName, String lastName, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public String getRelationshipStatus() {
        return relationshipStatus;
    }

    public String getHometown() {
        return hometown;
    }

    public String getEducation() {
        return education;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    // builder pattern
    public UserBuilder addAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder addDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public UserBuilder addEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder addGender(String gender) {
        if (gender.toUpperCase() == "MALE") {
            this.gender = "MALE";
        } else if (gender.toUpperCase() == "FEMALE") {
            this.gender = "FEMALE";
        } else {
            this.gender = "XXX";
        }
        return this;
    }

    public UserBuilder addEducation(String education) {
        this.education = education;
        return this;
    }

    public UserBuilder addHometown(String howntowm) {
        this.hometown = howntowm;
        return this;
    }

    public UserBuilder addRelationshipStatus(String relationshipStatus) {
        this.relationshipStatus = relationshipStatus;
        return this;
    }

    // Return the finally consrcuted User object
    public User build() {
        User user = new User(this);
        validateUserObject(user);
        return user;
    }

    private void validateUserObject(User user) {
        // Do some basic validations to check
        // if user object does not break any assumption of system
    }

}
