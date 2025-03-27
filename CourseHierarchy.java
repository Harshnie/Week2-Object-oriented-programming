class Course {
    protected String courseName;
    protected int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}

class OnlineCourse extends Course {
    protected String platform;
    protected boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double calculateFinalFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Course Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee after Discount: $" + calculateFinalFee());
    }
}

public class CourseHierarchy {
    public static void main(String[] args) {
        Course basicCourse = new Course("Introduction to Programming", 40);
        basicCourse.displayCourseDetails();

        OnlineCourse onlineCourse = new OnlineCourse("Java Fundamentals", 50, "Coursera", true);
        onlineCourse.displayCourseDetails();

        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Advanced Java", 60, "Udemy", true, 200.0, 25.0);
        paidCourse.displayCourseDetails();
    }
}
