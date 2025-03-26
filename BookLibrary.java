class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

class EBook extends Book {
    private String fileSize;

    public EBook(String ISBN, String title, String author, String fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBookDetails() {
        System.out.println("EBook ISBN (accessed from subclass): " + ISBN);
        System.out.println("EBook Title (accessed from subclass): " + title);
        System.out.println("File Size: " + fileSize);
    }
}

public class BookLibrary {
    public static void main(String[] args) {
        Book book1 = new Book("123-456-789", "Java Programming", "James");
        book1.displayDetails();
        book1.setAuthor("John Doe");
        System.out.println("\nUpdated Author: " + book1.getAuthor());

        System.out.println();

        EBook eBook = new EBook("987-654-321", "Python Programming", "Roshan", "2MB");
        eBook.displayEBookDetails();
    }
}
