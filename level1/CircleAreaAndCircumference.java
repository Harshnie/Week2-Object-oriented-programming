import java.util.Scanner;

class Circle {
    int radius;
    public double Area() {
        return Math.PI * radius * radius;
    }
	
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    void display() {
        System.out.println("The area of the circle for the given radius is: " + Area() + 
                           " and the circumference is: " + circumference());
    }
}

public class CircleAreaAndCircumference {
    public static void main(String[] args) { 
        Scanner scan = new Scanner(System.in);
        Circle circle1 = new Circle(); 

        System.out.println("Enter the radius of the circle: ");
        circle1.radius = scan.nextInt(); 

        System.out.println(); 
        circle1.display();

        scan.close(); 
    }
}
