import java.util.Map;

public class PositionChanges extends Team{
    public void promote(String name, String position){
        for (Map.Entry<String, String> me : members.entrySet()) {
            if (me.getValue() == name){
                members.replace(name,me.getValue(),position);
            }
        }
    }
}
