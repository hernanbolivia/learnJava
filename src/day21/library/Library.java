package day21.library;
/*
/** this is Composition: has a reference to a Book
 */
import java.util.ArrayList;
import java.util.List;

public class Library {


    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }


    //Behavioral method
    public void addBook(Book book){
        this.books.add(book);
    }


    public void removeBook(Book book){
        this.books.remove(book);
    }


    public void displayBooks(){
        if(this.books.isEmpty()){
            System.out.println("No books in the library");
        }else{
            for(Book book: this.books){
                System.out.println(book);
            }
        }
    }












}
