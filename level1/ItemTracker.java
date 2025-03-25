import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    void setItemDetails(int codeInput, String nameInput, double priceInput) {
        itemCode = codeInput;
        itemName = nameInput;
        price = priceInput;
    }

    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: $" + price);
    }

    double TotalCost(int quantity) {
        return price * quantity;
    }
}

public class ItemTracker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Item item1 = new Item();

        System.out.println("Enter item code: ");
        int code = scan.nextInt();
        scan.nextLine(); 

        System.out.println("Enter item name: ");
        String name = scan.nextLine();

        System.out.println("Enter item price: ");
        double price = scan.nextDouble();

        item1.setItemDetails(code, name, price);

        System.out.println("\nItem Details:");
        item1.displayItem();


        System.out.println("\nEnter quantity to purchase: ");
        int quantity = scan.nextInt();

        double totalCost = item1.TotalCost(quantity);
        System.out.println("Total cost for " + quantity + " items: $" + totalCost);

        scan.close(); 
    }
}
