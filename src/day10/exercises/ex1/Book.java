package day10.exercises.ex1;

public class Book {

    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    /*public void displayInformation(){

        System.out.println("\n=================== Book Information ===================");
        System.out.printf("%-20s: %s%n", "Title",this.title);
        System.out.printf("%-20s: %s%n", "Author",this.author);
        System.out.printf("%-20s: %d%n", "Pages",this.pages);
        System.out.println("==========================================================\n");
    }*/

    @Override
    public String toString() {
        return String.format(
                "\n======== Book Information ========\n"+
                        "%-20s: %s%n"+
                        "%-20s: %s%n"+
                        "%-20s: %d%n"+
                        "===================================\n",
                "Title",this.title,
                "Author", this.author,
                "Pages", this.pages
        );

    }
}
