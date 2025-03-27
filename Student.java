class Student {
    private static int totalStudents = 0;
    private static String universityName = "XYZ University";

    private final String rollNumber;
    private String name;
    private String grade;

    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }

    public void displayStudentDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }

    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
        }
    }

    public static void main(String[] args) {
        Student student1 = new Student("Anu", "S123", "A");
        Student student2 = new Student("Banu", "S124", "B");

        student1.displayStudentDetails();
        student2.displayStudentDetails();

        Student.displayTotalStudents();

        student1.updateGrade("A+");
        System.out.println("\nUpdated details for student1:");
        student1.displayStudentDetails();
    }
}
