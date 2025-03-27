interface Worker {
    void performDuties();
}

class Person {
    protected String name;
    protected int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    public void performDuties() {
        System.out.println("Role: Chef");
        System.out.println("Specialty: " + specialty);
        System.out.println("Duties: Preparing meals and managing kitchen.");
    }
}

class Waiter extends Person implements Worker {
    private int tablesAssigned;

    public Waiter(String name, int id, int tablesAssigned) {
        super(name, id);
        this.tablesAssigned = tablesAssigned;
    }

    public void performDuties() {
        System.out.println("Role: Waiter");
        System.out.println("Tables Assigned: " + tablesAssigned);
        System.out.println("Duties: Serving food and attending customers.");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Raj", 101, "Italian Cuisine");
        chef.displayPersonDetails();
        chef.performDuties();

        Waiter waiter = new Waiter("Ram", 202, 5);
        waiter.displayPersonDetails();
        waiter.performDuties();
    }
}
