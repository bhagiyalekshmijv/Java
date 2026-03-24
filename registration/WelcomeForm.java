package registration; // user-defined package

import java.util.Scanner; // for user input

public class WelcomeForm {
    public static void main(String[] args) {
        
        //Create Scanner object to take input
        Scanner input = new Scanner(System.in);

        //Ask user for first name
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        //Ask user for age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        //Display welcome message
        System.out.println("Welcome " + firstName + "!");
        System.out.println("You are " + age + "years old.");

        input.close(); // Close scanner
    }
}
