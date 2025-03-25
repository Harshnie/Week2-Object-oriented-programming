import java.util.Scanner;
class Student{
	String name;
	int rollnumber;
	double marks;
	
	char Grade() {
	if (marks >= 90)return "A";
	else if (marks >= 80) return "B";
	else if (marks >= 70) return "C";
	else if (marks >= 60) return "D";
	else return "F";
	}
	
	
    void displayStudentDetails() {
        System.out.println("Student Deets:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

public class StudentMark {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Student student1 = new Student();

        System.out.println("Enter student name: ");
        student1.name = scan.nextLine();

        System.out.println("Enter roll number: ");
        student1.rollNumber = scan.nextInt();

        System.out.println("Enter marks: ");
        student1.marks = scan.nextDouble();

        student1.displayStudentDetails();

        scan.close();
    }
}
	
	
