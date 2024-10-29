package final_program;
import java.util.ArrayList;



public class shelf {

    private ArrayList<book> books;
    private boolean isShelfFull;

    public shelf() {
        this.books = new ArrayList<>();
        this.isShelfFull=false;
    }

    public void addBook(book book)  {
        if(isShelfFull){
            System.out.println("The shelf is full!");
            return;
        }
        books.add(book);
        if(books.size()==5){
            isShelfFull=true;
        }
    }

    public void replaceBooks(int bookNumber1,int bookNumber2){
        if(bookNumber1 < 1 || bookNumber1>5 || bookNumber2 < 1 || bookNumber2 >5) {
            System.out.println("please enter valid number!!!");
        }
        else if(books.get(bookNumber1 - 1) == null || books.get(bookNumber2 - 1) == null){
            System.out.println("You are trying to replace with a book that does not exist on the page!");
        }else{
            book temp = books.get(bookNumber1-1);
            books.set(bookNumber1 -1, books.get(bookNumber2-1));
            books.set(bookNumber2 - 1,temp);
        }

    }

    public ArrayList<book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<book> books) {
        this.books = books;
    }

    public boolean isShelfFull() {
        return isShelfFull;
    }

    public void setShelfFull(boolean shelfFull) {
        isShelfFull = shelfFull;
    }
}
