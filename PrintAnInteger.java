import java.util.Scanner;

public class PrintAnInteger {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int num = input.nextInt();

        System.out.println("Number: " + num);
    }
}
