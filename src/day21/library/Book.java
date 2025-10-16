package day21.library;

public class Book {

    private String title;
    private String author;
    private int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + this.title +
                ", author=" + this.author +
                ", yearOfPublication=" + this.yearOfPublication + '}';
    }


}
