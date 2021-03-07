import io.cucumber.java.en.*;
import javax.swing.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class SearchBookSteps {

    private String subStringOfTitle;
    private String subStringOfAuthor;
    private String subStringOfISBN;

    private Books books = new Books();

    private int bookFoundByTitle;
    private int bookFoundByAuthor;
    private int bookFoundByISBN;

    @Given("The user types a substring book title")
    public void the_user_types_a_substring_book_title() {
        subStringOfTitle = "dig";
    }

    @When("The book exists in the library")
    public void the_book_exists_in_the_library() {
        bookFoundByTitle = books.searchByTitle(subStringOfTitle);
    }

    @Then("The book appears to the user with all info")
    public void the_book_appears_to_the_user_with_all_info() {
        assertTrue(bookFoundByTitle == 1);
    }

    @Given("The user types a substring book author")
    public void the_user_types_a_substring_book_author() {
        subStringOfAuthor = "moham";
    }

    @When("The book exists in the library for author")
    public void the_book_exists_in_the_library_for_author() {
        bookFoundByAuthor = books.searchByAuthor(subStringOfAuthor);
    }

    @Then("The book appears to the user with all info for author")
    public void the_book_appears_to_the_user_with_all_info_for_author() {
        assertTrue(bookFoundByAuthor == 1);
    }

    @Given("The user types a  valid book ISBN")
    public void the_user_types_a_valid_book_isbn() {
        subStringOfISBN = "45";
    }
    @When("The books isbn exists in the library")
    public void the_books_isbn_exists_in_the_library() {
        bookFoundByISBN = books.searchByISBN(subStringOfISBN);
    }
    @Then("The book with the isbn appears to the user with all info")
    public void the_book_with_the_isbn_appears_to_the_user_with_all_info() {
        assertTrue(bookFoundByISBN == 1);
    }


    @Given("The user searches for a book")
    public void the_user_searches_for_a_book() {
        subStringOfTitle = "ytsyg";
        subStringOfAuthor = "rami";
    }

    @When("The book doesn't exist in the library")
    public void the_book_doesn_t_exist_in_the_library() {
        bookFoundByTitle = books.searchByTitle(subStringOfTitle);
    }

    @Then("No book found")
    public void no_book_found() {
        assertTrue(bookFoundByTitle == 0);
    }

    @When("More than one book match the criteria")
    public void more_than_one_book_match_the_criteria() {
        bookFoundByAuthor = books.searchByAuthor(subStringOfAuthor);
    }

    @Then("Show all results")
    public void show_all_results() {
        assertTrue(bookFoundByAuthor > 1);
    }
}