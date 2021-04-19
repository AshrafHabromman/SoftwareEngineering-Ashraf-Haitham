package production;

public class Admin {

    private String userName;
    private String password;

    private boolean isLoggedIn;

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

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }


}
