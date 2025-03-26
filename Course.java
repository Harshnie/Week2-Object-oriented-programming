public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "ABC Institute";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Fee: Rs." + fee);
        System.out.println("Institute: " + instituteName);
    }

    public static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 5000);
        Course c2 = new Course("Web Development", 8, 7000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        updateInstituteName("Tech Academy");

        System.out.println("\nAfter updating institute name:\n");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
