import java.util.ArrayList;

public class Admins {

    ArrayList<Admin> allAdmins = new ArrayList<Admin>();

    public Admins(){
        allAdmins.add(new Admin("ahmad","12345",true));
        allAdmins.add(new Admin("ali","12345"));
        allAdmins.add(new Admin("khalid","12345"));
        allAdmins.add(new Admin("abd","12345"));

    }

}
