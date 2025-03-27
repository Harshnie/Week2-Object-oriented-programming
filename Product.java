class Product {
    private static double discount = 10.0; 
    private final String productID; 
    private String productName;
    private double price;
    private int quantity;

    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        double finalPrice = price - (price * discount / 100);
        System.out.println("Price after discount: " + finalPrice);
    }

    public static void main(String[] args) {
        Product prod1 = new Product("P001", "Laptop", 50000, 2);
        Product prod2 = new Product("P002", "Smartphone", 20000, 5);

        if (prod1 instanceof Product) {
            prod1.displayProductDetails();
        }

        if (prod2 instanceof Product) {
            prod2.displayProductDetails();
        }
        Product.updateDiscount(15.0);

        System.out.println("\nUpdated Product Details After Discount Update:");
        if (prod1 instanceof Product) {
            prod1.displayProductDetails();
        }

        if (prod2 instanceof Product) {
            prod2.displayProductDetails();
        }
    }
}
