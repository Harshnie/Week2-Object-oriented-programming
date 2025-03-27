class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    private int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Department: " + department);
    }
}

public class School{
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Mr. Ram", 35, "Mathematics");
        teacher.displayPersonDetails();
        teacher.displayRole();

        Student student = new Student("Priya", 16, 10);
        student.displayPersonDetails();
        student.displayRole();

        Staff staff = new Staff("Mrs. Latha", 45, "Administration");
        staff.displayPersonDetails();
        staff.displayRole();
    }
}
