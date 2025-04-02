import java.util.*;

interface Discountable {
    void applyDiscount(double percent);
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: Rs." + price + ", Quantity: " + quantity;
    }

    protected double getPrice() {
        return price;
    }

    protected int getQuantity() {
        return quantity;
    }

    public abstract double calculateTotalPrice();
}

class VegItem extends FoodItem implements Discountable {
    private double discount = 0.0;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discount);
    }

    @Override
    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            discount = percent / 100;
        }
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: " + (discount * 100) + "%";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount = 0.0;
    private final double nonVegCharge = 20.0;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        double total = (getPrice() + nonVegCharge) * getQuantity();
        return total - (total * discount);
    }

    @Override
    public void applyDiscount(double percent) {
        if (percent >= 0 && percent <= 100) {
            discount = percent / 100;
        }
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: " + (discount * 100) + "%";
    }
}

public class OnlineFoodDelivery {
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        VegItem veg = new VegItem("Paneer Tikka", 150, 2);
        NonVegItem nonVeg = new NonVegItem("Chicken Biryani", 200, 1);

        veg.applyDiscount(10);
        nonVeg.applyDiscount(5);

        order.add(veg);
        order.add(nonVeg);

        for (FoodItem item : order) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: Rs." + item.calculateTotalPrice());

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                System.out.println(d.getDiscountDetails());
            }

            System.out.println();
        }
    }
}
