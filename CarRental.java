public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double costPerDay = 1000;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    public void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public static void main(String[] args) {
        CarRental rental1 = new CarRental();
        CarRental rental2 = new CarRental("Ravi Kumar", "Hyundai i20", 5);

        System.out.println("Rental 1:");
        rental1.displayDetails();

        System.out.println("\nRental 2:");
        rental2.displayDetails();
    }
}
