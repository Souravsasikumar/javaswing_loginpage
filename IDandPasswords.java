import java.util.*;
public class IDandPasswords {

    HashMap<String,String> logininfo=new HashMap<>();
    IDandPasswords(){
        logininfo.put("Bro1","pizza");
        logininfo.put("Bro2","burger");
        logininfo.put("Bro3","chicken");
    }
    protected HashMap getlogininfo(){
        return logininfo;

    }
}