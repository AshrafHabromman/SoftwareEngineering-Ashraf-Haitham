public class Admin {

    private String userName;
    private String password;

    public Admin(){
        this.userName = "";
        this.password = "";
    }

    public Admin(String userName,String password ){
        this.userName = userName;
        this.password = password;
    }

    public String getUsername() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }
}
