import java.util.ArrayList;
import java.util.*;

public class Team {
    protected String name;
    protected int position;
    protected Map<String, String> members = new HashMap<>();

    public void newMember(String name, String position) {
        members.put(name,position);
    }

    public void leaveTeam(String name) {
        members.remove(name);
    }

    public String getMembers(){
        return members.toString();
    }
}
