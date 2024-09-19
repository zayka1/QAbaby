package task2.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Asd", "Dost");
        Book book2 = new Book("Asda", "Dosta");
        Book book3 = new Book("Asd", "Dost");

        BookCollection collection = new BookCollection();
        collection.addBook(book1);
        collection.addBook(book2);
        collection.addBook(book3);

        collection.printBooks();
    }
}
