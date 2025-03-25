import java.util.Scanner;

class Employee {
    String name;
    int id;
    int Salary;

    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + Salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Employee Emp1 = new Employee();

        System.out.println("Enter the first employee's name: ");
        Emp1.name = scan.nextLine();  

        System.out.println("Enter the first employee's id: ");
        Emp1.id = scan.nextInt();

        System.out.println("Enter the first employee's Salary: ");
        Emp1.Salary = scan.nextInt();

        System.out.println("Employee details:");
        Emp1.display();

        scan.close(); 
    }
}
