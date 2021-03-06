import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.mockito.Mockito;

import javax.swing.*;



import static org.junit.Assert.*;

public class LoginSteps {
    String username;
    String password;
    String wrongPassword;
    private boolean adminIsExist = false;
    private boolean adminDoesNotExist= false;
    private Admin admin1;
    private Admin admin2;


    Admins admins = new Admins();

    @Given("The admin chose to login")
    public void the_admin_chose_to_login() {
        // Write code here that turns the phrase above into concrete actions
        admin1 = new Admin("ahmad", "12345");
        admin2 = new Admin("khalid","12333");

    }

    @When("The admin login with valid credentials")
    public void the_admin_login_with_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions


        for(int i=0 ; i<admins.allAdmins.size(); i++){

            Admin obj = new Admin();
            obj = admins.allAdmins.get(i);
            if(obj.getUsername() == admin1.getUsername() && obj.getPassword() == admin1.getPassword()){
                adminIsExist = true;


            }
        }
    }

    @Then("The admin is directed to the homepage")
    public void the_admin_is_directed_to_the_homepage() {
        // Write code here that turns the phrase above into concrete actions

     assertTrue(adminIsExist);


    }

    @Then("The admin gets a greeting message")
    public void the_admin_gets_a_greeting_message() {
        // Write code here that turns the phrase above into concrete actions
        JOptionPane.showMessageDialog(null, "Welcome Admin");

    }

    @When("The admin logs in with the wrong password")
    public void the_admin_logs_in_with_the_wrong_password() {
        // Write code here that turns the phrase above into concrete actions

        Admin obj = new Admin();
        for(int i=0 ; i<admins.allAdmins.size(); i++){
            obj = admins.allAdmins.get(i);
            if(obj.getUsername() == admin2.getUsername() && obj.getPassword() == admin2.getPassword()){
                adminDoesNotExist = true;
            }
        }
    }

    @Then("The admin receives a warning message that it is wrong")
    public void the_admin_receives_a_warning_message_that_it_is_wrong() {
        // Write code here that turns the phrase above into concrete actions
        assertFalse(adminDoesNotExist);


    }

    @Then("clears the typed password")
    public void clears_the_typed_password() {
        // Write code here that turns the phrase above into concrete actions
        JOptionPane.showMessageDialog(null , "Wrong Password");
    }










}
