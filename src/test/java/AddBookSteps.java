import io.cucumber.java.en.*;
import javax.swing.*;
import static org.junit.Assert.*;

public class AddBookSteps {

    private boolean isLoggedIn;
    private boolean triesToAddBook = true;
    private boolean bookAdded;
    private Books books = new Books();

    @Given("Admin tries to add a book And  is logged in")
    public void admin_tries_to_add_a_book_and_is_logged_in() {
        isLoggedIn = true;
    }

    @When("The admin enter the information of the book")
    public void the_admin_enter_the_information_of_the_book() {
        Book book1 = new Book("java","ahmad","ahmad2020","12345");
        bookAdded = books.addNewBook(book1,isLoggedIn);
    }

    @Then("Book is added successfully")
    public void book_is_added_successfully() {
        assertTrue(bookAdded);
    }

    @Then("Message shows that the book is added")
    public void message_shows_that_the_book_is_added() {
        //JOptionPane.showMessageDialog(null , "Book added successfully");
    }

    @Given("Admin is not logged in")
    public void admin_is_not_logged_in() {
        isLoggedIn = false;
    }

    @When("Admin tries to add a book")
    public void admin_tries_to_add_a_book() {
        Book book1 = new Book("java","ahmad","ahmad2020","12345");
        bookAdded = books.addNewBook(book1,isLoggedIn);
    }

    @Then("Book cannot be added")
    public void book_cannot_be_added() {
        assertFalse(bookAdded);
    }

    @Then("Message shows that you have to log in")
    public void message_shows_that_you_have_to_log_in() {

        //JOptionPane.showMessageDialog(null , "Book does not added");
    }

}
