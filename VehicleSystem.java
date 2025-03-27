interface Refuelable {
    void refuel();
}

class Vehicle {
    protected String model;
    protected int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayVehicleDetails() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    public void charge() {
        System.out.println("Charging electric vehicle...");
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    private double fuelTankCapacity;

    public PetrolVehicle(String model, int maxSpeed, double fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public void refuel() {
        System.out.println("Refueling petrol vehicle...");
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}

public class VehicleSystem {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 200, 75);
        ev.displayVehicleDetails();
        ev.charge();

        PetrolVehicle pv = new PetrolVehicle("Honda City", 180, 40);
        pv.displayVehicleDetails();
        pv.refuel();
    }
}
