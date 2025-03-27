class Vehicle {
    double maxSpeed;
    String fuelType;

    Vehicle(double maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo() {
        System.out.println("The maximum speed is " + maxSpeed + " km/h");
        System.out.println("The fuel type is " + fuelType);
    }
}

class Car extends Vehicle {
    int seatCapacity;

    Car(double maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("The seating capacity is " + seatCapacity);
    }
}

class Truck extends Vehicle {
    int capacity;

    Truck(double maxSpeed, String fuelType, int capacity) {
        super(maxSpeed, fuelType);
        this.capacity = capacity;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("The load capacity is " + capacity + " kg");
    }
}

class Motorcycle extends Vehicle {
    double mileage;

    Motorcycle(double maxSpeed, String fuelType, double mileage) {
        super(maxSpeed, fuelType);
        this.mileage = mileage;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("The mileage of this motorcycle is " + mileage + " km/l");
    }
}

public class VehicleNew {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10000);
        vehicles[2] = new Motorcycle(150, "Petrol", 55);

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\nVehicle " + (i + 1) + " Info:");
            vehicles[i].displayInfo();
        }
    }
}
