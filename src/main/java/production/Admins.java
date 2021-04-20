package production;

import java.util.ArrayList;
import java.util.List;
public class Admins {

    public List<Admin> getAllAdmins() {
        return allAdmins;
    }

    private List<Admin> allAdmins = new ArrayList<>();

    public Admins(){
        allAdmins.add(new Admin("ahmad","123456",true));
        allAdmins.add(new Admin("ali","123457"));
        allAdmins.add(new Admin("khalid","123458"));
        allAdmins.add(new Admin("abd","123459"));
    }
}
