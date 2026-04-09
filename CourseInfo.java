class Course {

    String courseName;
    int duration;

    static int courseCount = 0;
    final String trainingCenter = "ABC Training Center";

    Course() {
        courseName = "Java";
        duration = 6;
        courseCount ++;
    }

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
        courseCount ++;
    }

    void display() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Training Center: " + trainingCenter);
    }

    class CourseMaterial {
        void showMaterial() {
            System.out.println("Materials provided for this course.");
        }
    }
}

public class CourseInfo {
    public static void main(String[] args) {
        
        Course c1 = new Course();
        Course c2 = new Course("Python", 6);

        System.out.println("Course 1:");
        c1.display();
        Course.CourseMaterial m1 = c1.new CourseMaterial();
        m1.showMaterial();

        System.out.println("\nCourse 2:");
        c2.display();
        Course.CourseMaterial m2 = c2.new CourseMaterial();
        m2.showMaterial();

        System.out.println("\nTotal Courses Created: " + Course.courseCount);
    }
}
