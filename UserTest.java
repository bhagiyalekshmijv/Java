abstract class User {

    abstract void showMessage();

    public void displayUserType() {
        System.out.println("User type selected"); 
    }
}

class AdminUser extends User {

    @Override
    public void showMessage() {
        System.out.println("Welcome, Admin!");
    }
}

class GuestUser extends User {

    @Override
    public void showMessage() {
        System.out.println("Welcome, Guest!");
    }
}

public class UserTest {
    public static void main(String[] args) {
        
        User admin = new AdminUser();
            admin.displayUserType();
            admin.showMessage();

        User guest = new GuestUser();
            guest.displayUserType();
            guest.showMessage();
    }
}
