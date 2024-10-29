package final_program;

public class book {

    private String author;
    private String title;
    private int numOfPages;

    public book(String author, String title, int numOfPages) {
        this.author = author;
        this.title = title;
        this.numOfPages = numOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}