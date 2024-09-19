package task2.Book;

import java.util.HashSet;

public class BookCollection {
    HashSet<Book> collection;

    public void addBook(Book book){
        collection.add(book);
    }
    public void deleteBook(Book book){
        collection.remove(book);
    }
    public void isInCollection(Book book){
        System.out.println(collection.contains(book));
    }

    public BookCollection() {
        this.collection = new HashSet<>();
    }
    public void printBooks(){
        for (Book book: collection){
            System.out.println(book.toString());
        }
    }
}
