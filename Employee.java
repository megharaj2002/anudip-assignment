//encapsulation 
public class Employee {
    private int id;
    private double salary;
    private String designation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setId(101);
        emp.setSalary(50000.0);
        emp.setDesignation("Software Engineer");

        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Salary: " + emp.getSalary());
        System.out.println("Employee Designation: " + emp.getDesignation());
    }
}
