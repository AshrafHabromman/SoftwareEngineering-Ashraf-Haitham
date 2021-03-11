import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import production.Admins;

import javax.swing.*;
import static org.junit.Assert.*;


public class LogoutSteps {

    private boolean choseToLogout;
    private boolean isLoggedIn;

    Admins admins = new Admins();

    @Given("The admin chose to logout")
    public void the_admin_chose_to_logout() {
        // Write code here that turns the phrase above into concrete actions
        choseToLogout = true;
    }

    @When("The admin is logged in")
    public void the_admin_is_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        isLoggedIn = admins.allAdmins.get(0).isLoggedIn();
    }

    @Then("The admin is directed to the login page")
    public void the_admin_is_directed_to_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(isLoggedIn &&choseToLogout);
    }

    @Then("The admin gets a goodbye message")
    public void the_admin_gets_a_goodbye_message() {
        // Write code here that turns the phrase above into concrete actions
        //JOptionPane.showMessageDialog(null , "Goodbye Admin");
    }


















}
