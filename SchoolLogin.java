import java.util.Scanner;

public class SchoolLogin {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter username code (A/S/G): ");
        char userName = input.next().charAt(0);

        System.out.print("Enter the password: ");
        int passWord = input.nextInt();

        System.out.print("Enter role ID (1/2/3): ");
        int roleId = input.nextInt();

        if (userName == 'A' && passWord == 1234 && roleId == 1) {
            System.out.println("Welcome Admin. Full access granted.");
        }

        else if (userName == 'S' && passWord == 1111 && roleId == 2) {
            System.out.println("Welcome Student. Limited access granted.");
        }

        else if (roleId == 3) {
            System.out.println("Welcome Guest. View-only access.");
        }

        else {
            System.out.println("Invalid credentials or role.");
        }

        input.close();
    }
}
