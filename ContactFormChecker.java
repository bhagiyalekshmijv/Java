import java.util.Scanner;

public class ContactFormChecker {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your email id: ");
        String email = input.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = input.nextLine();

        String regex = "^[A-Z][a-zA-Z ]*$";

        if (name.matches(regex)) {
            System.out.println("Name is valid.");
        }
        else {
            System.out.println("Invalid name.");
        }

        if (email.contains("@") && email.contains(".") && 
        !email.startsWith("@") && !email.endsWith("@") &&
        !email.startsWith(".") && !email.endsWith(".")) {
            System.out.println("Email is valid");
        }
        else {
            System.out.println("Email is invalid");
        }

        if (phone.matches("\\d{10}")) {
            System.out.println("Phone number is valid");
        }
        else {
            System.out.println("Phone number is invalid");
        }

        input.close();
    }
}
