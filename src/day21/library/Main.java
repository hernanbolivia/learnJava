package day21.library;

public class Main {
    public static void main(String[] args) {

        //Instantiate object
        Library myLibrary = new Library();

        //Create books
        Book book1 = new Book("The Hobbit", "R.R", 1937);
        Book book2 = new Book("To learn Java", "Ernest", 2019);

        //Add books to a library
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);

        //Display books
        myLibrary.displayBooks();

        //Remove book
        myLibrary.removeBook(book1);

        //Display books
        System.out.println("\nBooks after removing one:");
        myLibrary.displayBooks();




    }
}
