public class GradeReport {
    public static void main(String[] args) {
        
        int[] marks = {78, 82, 91, 65, 34};
        int total = 0;
        boolean fail = false;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35) {
                System.out.println("Fail");
                fail = true;
                break;
            }
            total += marks[i];
        }

        if (!fail) {
            double avg = total / 5.0;
            System.out.println("Total: " + total);
            System.out.println("Average: " + avg);

            if (avg >= 90) {
                System.out.println("Grade: A");
            }
            else if (avg >= 75) {
                System.out.println("Grade: B");
            }
            else if (avg >= 60) {
                System.out.println("Grade: C");
            }
            else {
                System.out.println("Grade: D");
            }
        }
    }
}
