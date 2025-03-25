import java.util.Scanner;

class Book {
    String title;
    String author;
    int price;

    void display() {
        System.out.println("The Book's name is " + title + ", Author is: " + author + ", and the price is: " + price);
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Book Book1 = new Book();

        System.out.println("Enter the Book's title: ");
        Book1.title = scan.nextLine();  

        System.out.println("Enter the Book's Author: ");
        Book1.author = scan.nextLine();

        System.out.println("Enter the Book's price: ");
        Book1.price = scan.nextInt();

        System.out.println("The details of the Book is:");
        Book1.display();

        scan.close(); 
    }
}
