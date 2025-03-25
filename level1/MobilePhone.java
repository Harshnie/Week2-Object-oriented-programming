import java.util.Scanner;

class MobilePhone {
    String brand;
    String model;
    double price;

    void setPhoneDetails(String phoneBrand, String phoneModel, double phonePrice) {
        brand = phoneBrand;
        model = phoneModel;
        price = phonePrice;
    }

    void displayPhoneDetails() {
        
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
       
    }
}

public class MobilePhonedeets {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        MobilePhone phone1 = new MobilePhone();

        System.out.println("Enter phone brand: ");
        String brand = scan.nextLine();

        System.out.println("Enter phone model: ");
        String model = scan.nextLine();

        System.out.println("Enter phone price: ");
        double price = scan.nextDouble();
        scan.nextLine();

        phone1.setPhoneDetails(brand, model, price);
        phone1.displayPhoneDetails();

        scan.close();
    }
}
