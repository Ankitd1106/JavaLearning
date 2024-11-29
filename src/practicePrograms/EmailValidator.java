package practicePrograms;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class EmailValidator {
    public static void main(String[] args) {
        String email1 = "test.email@example.com";
        String email2 = "invalid-email.com";
        String email3 = "email+valid@hm.com";

        System.out.println(email1 + " is valid: " + validateEmail(email1));
        System.out.println(email2 + " is valid: " + validateEmail(email2));
        System.out.println(email3 + " is valid: " + validateEmail(email3));
    }

        // Function to validate the format of an email address
        public static boolean validateEmail(String email) {
            // Regular expression for a valid email format
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

            // Compile the regex pattern
            Pattern pattern = Pattern.compile(emailRegex);

            // Match the email against the pattern
            Matcher matcher = pattern.matcher(email);

            // Return true if the email matches the pattern, otherwise false
            return matcher.matches();
        }

}
