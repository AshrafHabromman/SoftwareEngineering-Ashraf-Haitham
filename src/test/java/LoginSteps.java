import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.swing.*;



import static org.junit.Assert.*;

public class LoginSteps {
 String Username;
 String Password;
 String WrongPassword;
 String actualAnswerUser;
 String actualAnswerPass;

    @Given("The admin chose to login")
    public void the_admin_chose_to_login() {
        // Write code here that turns the phrase above into concrete actions

             Username = "ahmad";
             Password = "1234";
             WrongPassword = "1222";


    }

    @When("The admin login with valid credentials")
    public void the_admin_login_with_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
        actualAnswerUser = Admin.getUsername();
        actualAnswerPass = Admin.getPassword();


    }

    @Then("The admin is directed to the homepage")
    public void the_admin_is_directed_to_the_homepage() {
        // Write code here that turns the phrase above into concrete actions

     assertTrue(Username == actualAnswerUser );
     assertTrue(Password == actualAnswerPass );


    }

    @Then("The admin gets a greeting message")
    public void the_admin_gets_a_greeting_message() {
        // Write code here that turns the phrase above into concrete actions
        JOptionPane.showMessageDialog(null, "Welcome Admin");

    }

    @When("The admin logs in with the wrong password")
    public void the_admin_logs_in_with_the_wrong_password() {
        // Write code here that turns the phrase above into concrete actions
        actualAnswerUser = Admin.getUsername();
        actualAnswerPass = Admin.getPassword();
    }

    @Then("The admin receives a warning message that it is wrong")
    public void the_admin_receives_a_warning_message_that_it_is_wrong() {
        // Write code here that turns the phrase above into concrete actions
        assertTrue(Username == actualAnswerUser );
        assertFalse(WrongPassword == actualAnswerPass );


    }

    @Then("clears the typed password")
    public void clears_the_typed_password() {
        // Write code here that turns the phrase above into concrete actions
        JOptionPane.showMessageDialog(null , "Wrong Password");
    }










}
