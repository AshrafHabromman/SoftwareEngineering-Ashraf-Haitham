package production;

import java.util.logging.Logger;

public class Admin {

    private String userName;
    private String password;

    private boolean isLoggedIn;
    Logger logger =Logger.getLogger(Admin.class.getName());


    public Admin(){
        this.userName = "";
        this.password = "";
        this.isLoggedIn = false;
    }

    public Admin(String userName,String password,boolean isLoggedIn){
        this.userName = userName;
        this.password = password;
        this.isLoggedIn = isLoggedIn;
    }

    public Admin(String userName,String password){
        this.userName = userName;
        this.password = password;
        this.isLoggedIn = false;
        logger.info("I am in the constructor");
    }

    public String getUsername() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }



}
