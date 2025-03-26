public class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 5000;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: Rs." + registrationFee);
    }

    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Anita", "Car");
        Vehicle v2 = new Vehicle("Neha ", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        updateRegistrationFee(6000);

        System.out.println("\nAfter updating registration fee:\n");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}
