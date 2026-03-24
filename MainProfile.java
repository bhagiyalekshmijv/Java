//import classes from user-defined packages
import profile.UserInput;
import greeting.GreetingDisplay;

public class MainProfile {
    
    public static void main(String[] args) {
        
        //Create object of UserInput
        UserInput user = new UserInput();

        //Get user name
        String userName = user.getUserName();

        //create object of GreetingDisplay
        GreetingDisplay greet = new GreetingDisplay();

        //Display greeting
        greet.showGreeting(userName);

    }
}
