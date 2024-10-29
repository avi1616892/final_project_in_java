package final_program;
import java.util.ArrayList;

public class reader {

    private int id;
    private String name;
    private ArrayList<String> readBooks;

    public reader(int id,String name) {
        this.id = id;
        this.name = name;
        readBooks = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getReadBooks() {
        return readBooks;
    }

    public void setReadBooks(ArrayList<String> readBooks) {
        this.readBooks = readBooks;
    }

    public void readBooks(String title){
        if (readBooks.contains(title)){
            System.out.println("The book" + title + "has already been read");
        }
        readBooks.add(title);
    }
}