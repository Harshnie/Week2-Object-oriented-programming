class Book {
    private static String libraryName = "City Library";
    private final String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    public void displayBookDetails() {
        System.out.println("Library Name: " + libraryName);
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    public static void main(String[] args) {
        Book book1 = new Book("123-456-789", "Java Programming", "James ");
        Book book2 = new Book("987-654-321", "Python Programming", "Roshan");

        Book.displayLibraryName();

        if (book1 instanceof Book) {
            book1.displayBookDetails();
        }

        if (book2 instanceof Book) {
            book2.displayBookDetails();
        }
    }
}
