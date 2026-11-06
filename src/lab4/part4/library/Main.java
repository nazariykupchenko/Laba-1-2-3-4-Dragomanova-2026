package lab4.part4.library;

public class Main {

    public static void main(String[] args) {
        Library city = new Library("City Library");
        Library campus = new Library("Campus Library");

        city.addBooks(
                new Book("1", "Kobzar"),
                new Book("2", "Lisova Pisnia"));
        city.addBooks(new Book("3", "Zakhar Berkut"));
        campus.addBooks(
                new Book("4", "Tigrolovy"),
                new Book("5", "Marusia"),
                new Book("6", "Eneida"),
                new Book("7", "Kaidasheva Simia"));


        System.out.println("Total books in all libraries: " + Library.totalBooks);

    }
}
