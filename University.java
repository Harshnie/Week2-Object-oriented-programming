class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

class PostgraduateStudent extends Student {
    private String specialization;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

    public void displayPGDetails() {
        System.out.println("Postgraduate Student Name (accessed from subclass): " + name);
        System.out.println("Specialization: " + specialization);
    }
}

public class University {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Riya", 8.5);
        s1.displayDetails();
        s1.setCGPA(9.0);
        System.out.println("\nUpdated CGPA: " + s1.getCGPA());

        System.out.println();

        PostgraduateStudent pg = new PostgraduateStudent(201, "Arjun", 9.2, "Data Science");
        pg.displayPGDetails();
    }
}
