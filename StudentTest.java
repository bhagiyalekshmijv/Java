class Student {

    private String name;
    private int rollNo;
    private double percentage;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }
}

public class StudentTest {
    public static void main(String[] args) {
        
        Student s = new Student();

        s.setName("Anu");
        s.setRollNo(10);
        s.setPercentage(80);

        System.out.println("Student Name: " + s.getName());
        System.out.println("Roll No: " + s.getRollNo());
        System.out.println("Percentage: " + s.getPercentage());
    }
}
