import java.util.Scanner;

public class TrainingPortal {
    public static void main(String[] args) {

        String oriUserName = "admin";
        String oriPassWord = "java123";

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your user name: ");
        String userName = input.nextLine();

        System.out.print("Enter the password: ");
        String passWord = input.nextLine();

        if (userName.equals(oriUserName) && passWord.equals(oriPassWord)) {
            System.out.println("Login Successful");
        }

        else {
            System.out.println("Access Denied");
        }

        input.close();
    }
}
