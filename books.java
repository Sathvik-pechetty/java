public class Book {
    String title;
    String author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class PrintBook {

    public static void displayBookInfo(Book book) {
        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Price: $" + book.price);
    }
}

public class Main {

    public static void main(String[] args) {
        Book myBook = new Book("Effective Java", "Joshua Bloch", 45.00);
        PrintBook.displayBookInfo(myBook);
    }
}
