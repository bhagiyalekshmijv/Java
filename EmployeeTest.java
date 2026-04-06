class Employee {

    private String name;
    private int idNumber;
    private String department;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee e1 = new Employee();
        Employee e2 = new Employee();

        e1.setName("Anu");
        e1.setIdNumber(004);
        e1.setDepartment("HR");
        e1.setSalary(25000);

        e2.setName("Ram");
        e2.setIdNumber(005);
        e2.setDepartment("Sales");
        e2.setSalary(20000);

        System.out.println("Employee 1: ");
        System.out.println(e1.getName() + " " + e1.getIdNumber() + " " + e1.getDepartment() + " " + e1.getSalary());

        System.out.println("\nEmployee 2: ");
        System.out.println(e2.getName() + " " + e2.getIdNumber() + " " + e2.getDepartment() + " " + e2.getSalary());
    }
}
