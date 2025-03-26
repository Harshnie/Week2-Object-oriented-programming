public class Library {
    private String title;
    private String author;
    private double price;
    private boolean available;

    public Library(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is currently not available.");
        }
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }

    public static void main(String[] args) {
        Library book1 = new Library("Wings of Fire", "A.P.J. Abdul Kalam", 350);
        book1.displayDetails();
        book1.borrowBook();
        book1.borrowBook();
    }
}
