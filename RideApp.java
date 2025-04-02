import java.util.*;

interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    private String location;

    public Vehicle(String vehicleId, String driverName, double ratePerKm, String location) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
        this.location = location;
    }

    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/KM: Rs." + ratePerKm;
    }

    protected double getRatePerKm() {
        return ratePerKm;
    }

    protected void setLocation(String location) {
        this.location = location;
    }

    protected String getLocation() {
        return location;
    }

    public abstract double calculateFare(double distance);
}

class Car extends Vehicle implements GPS {
    public Car(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 50;
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}

class Bike extends Vehicle implements GPS {
    public Bike(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}

class Auto extends Vehicle implements GPS {
    public Auto(String vehicleId, String driverName, double ratePerKm, String location) {
        super(vehicleId, driverName, ratePerKm, location);
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20;
    }

    @Override
    public String getCurrentLocation() {
        return getLocation();
    }

    @Override
    public void updateLocation(String newLocation) {
        setLocation(newLocation);
    }
}

public class RideApp {
    public static void main(String[] args) {
        List<Vehicle> rides = new ArrayList<>();
        rides.add(new Car("CAR123", "Amit", 15, "Sector 21"));
        rides.add(new Bike("BIKE456", "Revi", 8, "MG Road"));
        rides.add(new Auto("AUTO789", "Suresh", 10, "Central Station"));

        for (Vehicle v : rides) {
            System.out.println(v.getVehicleDetails());
            System.out.println("Current Location: " + ((GPS) v).getCurrentLocation());
            ((GPS) v).updateLocation("New Destination");
            System.out.println("Updated Location: " + ((GPS) v).getCurrentLocation());
            System.out.println("Fare for 10 KM: Rs." + v.calculateFare(10));
            System.out.println();
        }
    }
}
