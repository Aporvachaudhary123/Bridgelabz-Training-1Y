import java.util.Scanner;
public class UserInputValidation {



        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String correctUsername = "admin";
            String correctPassword = "1234";

            String username = sc.nextLine();
            String password = sc.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login Successful");
            } else {
                System.out.println("Invalid Credentials");
            }
        }

}
