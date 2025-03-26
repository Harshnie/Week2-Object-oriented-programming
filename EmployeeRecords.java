class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void modifySalary(double newSalary) {
        this.salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: Rs." + salary);
    }
}

class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayManagerDetails() {
        System.out.println("Manager Employee ID (accessed from subclass): " + employeeID);
        System.out.println("Manager Department (accessed from subclass): " + department);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "IT", 55000);
        employee1.displayDetails();
        
        employee1.modifySalary(60000);
        System.out.println("\nUpdated Salary: Rs." + employee1.getSalary());

        System.out.println();

        Manager manager1 = new Manager(102, "Sales", 75000);
        manager1.displayManagerDetails();
        manager1.displayDetails();
    }
}
