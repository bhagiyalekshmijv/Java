import java.util.Scanner;

class  Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int subtraction(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return (double) a / b;
    }
}

public class JavaExam4MainCalculator {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Calculator calc = new Calculator();

        System.out.print("Enter two numbers: ");
        
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtraction(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));

        input.close();
    }
}
