package lab4.part4.library;

public class Library {

    static int totalBooks = 0;

    final String name;
    Book[] collection = new Book[0];

    public Library(String name) {
        this.name = name;
    }

    void addBooks(Book... newBooks) {
        Book[] bigger = new Book[collection.length + newBooks.length];

        for (int i = 0; i < collection.length; i++) {
            bigger[i] = collection[i];
        }
        for (int i = 0; i < newBooks.length; i++) {
            bigger[collection.length + i] = newBooks[i];
        }

        collection = bigger;
        totalBooks += newBooks.length;
    }



}
