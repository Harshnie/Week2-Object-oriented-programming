class Employee {
    String EmpName;
    int id;
    double Salary;

    Employee(String EmpName, int id, double Salary) {
        this.EmpName = EmpName;
        this.id = id;
        this.Salary = Salary;
    }

    void displayDetails() {
        System.out.println("Name: " + EmpName);
        System.out.println("ID: " + id);
        System.out.println("Salary is Rs: " + Salary);
    }
}

class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    int duration;

    Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + duration + " months");
    }
}

public class Emp1 {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 101, 95000, 10);
        Employee developer = new Developer("Bob", 102, 80000, "Java");
        Employee intern = new Intern("Charlie", 103, 15000, 6);

        System.out.println("\n Manager Details ");
        manager.displayDetails();

        System.out.println("\n Developer Details ");
        developer.displayDetails();

        System.out.println("\n Intern Details ");
        intern.displayDetails();
    }
}
