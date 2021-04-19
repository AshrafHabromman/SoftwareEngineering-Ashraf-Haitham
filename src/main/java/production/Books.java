package production;
import java.util.ArrayList;

public class Books {

    ArrayList<Book> allBooks = new ArrayList<Book>();
    public Books(){
        allBooks.add(new Book("c++","ramiz", "john2020","123"));
        allBooks.add(new Book("AI","rami", "rami2021","1234"));
        allBooks.add(new Book("digital","mohamad", "mohamad2018","12345"));
    }
    public int searchByTitle(String subStringOfTitle) {
        Book obj = new Book();
        int numOfBooks = 0;
        CharSequence title = subStringOfTitle;
        for (int i=0; i<this.allBooks.size(); i++){
            obj = this.allBooks.get(i);
            if (obj.getTitle().contains(title)){
                numOfBooks++;
            }
        }
        return numOfBooks;
    }

    public boolean addNewBook(Book bookToAdd, boolean isLoggedIn) {
        if(isLoggedIn == false)
            return false;

        boolean bookAdded = this.allBooks.add(bookToAdd);
        return bookAdded;
    }

    public int searchByAuthor(String subStringOfAuthor) {

        Book obj = new Book();
        int numOfBooks = 0;
        CharSequence author = subStringOfAuthor;
        for (int i=0; i<this.allBooks.size(); i++){
            obj = this.allBooks.get(i);
            if (obj.getAuthor().contains(author)){
                numOfBooks++;
            }
        }
        return numOfBooks;
    }

    public int searchByISBN(String subStringOfISBN) {
        Book obj = new Book();
        int numOfBooks = 0;
        CharSequence iSBN = subStringOfISBN;
        for (int i=0; i<this.allBooks.size(); i++){
            obj = this.allBooks.get(i);
            if (obj.getiSBN().contains(iSBN)){
                numOfBooks++;
            }
        }
        return numOfBooks;
    }
}
