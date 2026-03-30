import java.util.Scanner;
import java.time.LocalDateTime;


public class AttendenceSystem {
    
    public static double calculateAverage(int[] marks) {
        int sum =0;

        for (int m: marks) {
            sum += m;
        }

        return (double) sum / marks.length;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        input.nextLine();

        String[] names = new String[n];
        int[] marks = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            names[i] = input.nextLine();

            System.out.print("Enter mark: ");
            marks[i] = input.nextInt();
            input.nextLine();
        }

        System.out.println("\nStudent Details: ");

        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + " - " + marks[i]);
             if (marks[i] < 35) {
                System.out.println("Needs Improvement");
             }
        }

        double avg = calculateAverage(marks);
        System.out.println("\nAverage Marks: " + avg);

        System.out.println("Program ended at: " + LocalDateTime.now());

        input.close();
    }
}
