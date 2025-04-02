import java.util.*;

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    protected String vehicleNumber;
    protected String type;
    protected double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public abstract double calculateRentalCost(int days);

    public String getVehicleDetails() {
        return "Vehicle Number: " + vehicleNumber + ", Type: " + type + ", Rate per day: " + rentalRate;
    }
}

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance() {
        return 0.05 * rentalRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance (Car): Policy No. [Hidden for Security]";
    }
}

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days * 0.9;
    }

    @Override
    public double calculateInsurance() {
        return 0.02 * rentalRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance (Bike): Policy No. [Hidden for Security]";
    }
}

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days + 500;
    }

    @Override
    public double calculateInsurance() {
        return 0.1 * rentalRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance (Truck): Policy No. [Hidden for Security]";
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("CAR123", 1000, "CARPOL123"));
        vehicles.add(new Bike("BIK456", 300, "BIKPOL456"));
        vehicles.add(new Truck("TRK789", 2000, "TRKPOL789"));

        int rentalDays = 5;

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Rental Cost for " + rentalDays + " days: Rs." + vehicle.calculateRentalCost(rentalDays));
            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: Rs." + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }
            System.out.println();
        }
    }
}
