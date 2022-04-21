import java.sql.Date;

public class User {
    // All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final String phone; // required

    private final int age; // optional
    private final Date dateOfBirth; // optional
    private final String email; // optional
    private final String gender; // optional
    private final String education; // optional
    private final String hometown; // optional
    private final String relationshipStatus; // optional

    User(UserBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.phone = builder.getPhone();
        this.age = builder.getAge();
        this.dateOfBirth = builder.getDateOfBirth();
        this.email = builder.getEmail();
        this.gender = builder.getGender();
        this.education = builder.getEducation();
        this.hometown = builder.getHometown();
        this.relationshipStatus = builder.getRelationshipStatus();
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
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

    // All getter, and NO setter to provde immutability
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "User: " + this.firstName + " " + this.lastName +
                ", Age: " + this.age +
                ", Phone: " + this.phone +
                (this.dateOfBirth == null ? "" : "\nDate of Birth: " + this.dateOfBirth) +
                (this.email == null ? "" : "\nEmail: " + this.email) +
                (this.education == null ? "" : "\nEducation: " + this.education) +
                (this.gender == null ? "" : "\nGender: " + this.gender) +
                (this.hometown == null ? "" : "\nHome Town: " + this.hometown) +
                (this.relationshipStatus == null ? "" : "\nRelationship: " + this.relationshipStatus) + ".";
    }

}