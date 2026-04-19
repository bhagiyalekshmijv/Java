import java.util.Scanner;

public class LargestTwoNumbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = sc.nextInt();

        int array[] = new int[n];
        System.out.println("Enter the elements: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }

        int largest1, largest2, temp;

        largest1 = array[0];
        largest2 = array[1];

        if (largest1 < largest2) {
            temp = largest1;
            largest1 = largest2;
            largest2 =  temp;
        }

        for (int i = 2; i<array.length; i++) {
            if (array[i] > largest1) {
                largest2 = largest1;
                largest1 = array[i];
            }
            else if (array[i] > largest2 && array[i] != largest1) {
                largest2 = array[i];
            }
        }
        sc.close();
        System.out.println("First largest number: " + largest1);
        System.out.println("Second largest number: " + largest2);
    }
}
