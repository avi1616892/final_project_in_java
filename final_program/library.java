package final_program;
import java.util.ArrayList;
import java.util.List;

public class library {

    private List<shelf> shelves;
    private List<reader> readers;

    public library() {
        shelves = new ArrayList<>();
        readers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            shelves.add(new shelf());
        }
    }

    public List<shelf> getShelves() {
        return shelves;
    }

    public void setShelves(List<shelf> shelves) {
        this.shelves = shelves;
    }

    public List<reader> getReaders() {
        return readers;
    }

    public void setReaders(List<reader> readers) {
        this.readers = readers;
    }

    public Boolean  isTherePlaceForNewBook(){
        for (shelf shelf: shelves){
            if(!shelf.isShelfFull()){
                return true;
            }
        }
        return false;
    }

    public void addNewBook(book book){
        for(shelf shelf : shelves){
            if(!shelf.isShelfFull()){
                shelf.addBook(book);
                return;
            }
        }
        System.out.println("no more space in shelf please wait until shelf be empty again");
    }

    public void deleteBook(String title){
        for (shelf shelf : shelves) {
            for (book book : shelf.getBooks()) {
                if (book.getTitle().equalsIgnoreCase(title)) {
                    shelf.getBooks().remove(book);
                    System.out.println("The " + book.getTitle() + " removed");
                    return;
                }
            }
        }
        System.out.println("Not found a book with this title");
    }

    public void registerReader(int id, String name) {
        reader reader = new reader(id, name);
        if (reader.getId() == id) {
            System.out.println("This id already exists");
        }readers.add(reader);
    }

    public void removeReader(String name){
        for (reader reader : readers){
            if(reader.getName().contains(name)){
                readers.remove(reader);
                System.out.println("The "+ reader.getName()  + " removed from list");
                return;
            }
        }
        System.out.println("Not found reader with this name");
    }

    public List<String> searchByAuthor(String authorName){
        boolean found = false;
        List<String> titles = new ArrayList<>();
        for (shelf shelf : shelves){
            for (book book : shelf.getBooks()){
                if(book.getAuthor().equalsIgnoreCase(authorName)){
                    titles.add(book.getTitle());
                    System.out.println("The " + book.getTitle() + " founded");
                    found = true;
                }
            }
        }if(!found){
            System.out.println("Not found author Name books");
        }
        return titles;
    }
}