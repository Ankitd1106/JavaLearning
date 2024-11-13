import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class userInputExample {
    static void takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email : ");
        String email = scanner.nextLine();
        String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            if (email.chars().filter(ch -> ch == '@').count() == 1) {  // Ensure only one '@' symbol
                System.out.println("valid email ID");
            }
        } else {
            System.out.println("Invalid email ID");
        }
    }
}

public static void main(String[] args) {
   userInputExample.takeInput();
}