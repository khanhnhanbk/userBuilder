import java.sql.Date;

public class App {
    public static void main(String[] args) {
        User user = new UserBuilder("John", "Smith", "1234567890")
                .addAge(30)
                .addDateOfBirth(new Date(System.currentTimeMillis()))
                .addEducation("Bachelor")
                .build();
        System.out.println(user);
    }
}
