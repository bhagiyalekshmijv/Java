import java.util.Scanner;

    class Student  {
        int id;
        String name;
        
        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
public class JavaExam3FindStudent {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        Student[] students = {
            new Student(1, "rajesh"),
            new Student(2, "rahul"),
            new Student(3, "sruthi")
        };

        System.out.print("Enter ID ");
        int searchId = input.nextInt();

        boolean found = false;

        for (Student s : students) {
            if (s.id == searchId) {
                System.out.println("ID: " + s.id + " Name: " + s.name);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found");
        }
        input.close();
    }
}
