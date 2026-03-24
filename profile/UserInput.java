package profile; // user-defined package

import java.util.Scanner; // for user input

public class UserInput {
    
    // Method to get user name
    public String getUserName() {
        Scanner input = new Scanner(System.in);

        // Ask user for their name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Return the entered name
        return name;
    }
}
