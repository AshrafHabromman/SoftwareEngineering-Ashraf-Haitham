import java.util.ArrayList;

public class Books {

    ArrayList<Book> allBooks = new ArrayList<Book>();
    public Books(){
        allBooks.add(new Book("c++","john", "john2020","123"));
        allBooks.add(new Book("AI","rami", "rami2021","1234"));
        allBooks.add(new Book("digital","mohamad", "mohamad2018","12345"));
    }


    public boolean addNewBook(Book bookToAdd, boolean isLoggedIn) {
        if(isLoggedIn == false)
            return false;

        boolean bookAdded = this.allBooks.add(bookToAdd);
        return bookAdded;
    }
}
