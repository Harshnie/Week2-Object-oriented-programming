class Employee {
    private static String companyName = "Tech Solutions Inc.";
    private static int totalEmployees = 0;
    private final String id;
    private String name;
    private String designation;

    public Employee(String id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public void displayEmployeeDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("E001", "John", "Software Engineer");
        Employee emp2 = new Employee("E002", "Smith", "Project Manager");

        Employee.displayTotalEmployees();

        if (emp1 instanceof Employee) {
            emp1.displayEmployeeDetails();
        }

        if (emp2 instanceof Employee) {
            emp2.displayEmployeeDetails();
        }
    }
}
