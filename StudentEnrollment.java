class Course {

    String name;
    int duration;
    int studentsEnrolled;

    final String creator = "CodeMentor Academy";
    static int totalStudents = 0;

    Course(String name, int duration, int studentsEnrolled) {
        this.name = name;
        this.duration = duration;
        this.studentsEnrolled = studentsEnrolled;

        totalStudents += studentsEnrolled;
    }

    void display() {
        System.out.println("Course Name: " + name);
        System.out.println("Duration: " + duration +" weeks");
        System.out.println("Students Enrolled: " + studentsEnrolled);
        System.out.println("Creator: " + creator);
    }

    static class Platform {
        static void showPlatform() {
            System.out.println("Courses are hosted on CodeMentor.");
        }    
    }
}

public class StudentEnrollment {
    public static void main(String[] args) {
        
        Course c1 = new Course("Java", 6, 30);
        Course c2 = new Course("Python", 6, 40);

        System.out.println("Course 1:");
        c1.display();

        System.out.println("\nCourse 2:");
        c2.display();

        System.out.println("\nTotal Students: " + Course.totalStudents);

        Course.Platform.showPlatform();
    }
}
