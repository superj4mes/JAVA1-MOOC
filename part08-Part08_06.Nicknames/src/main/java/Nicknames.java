
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> nickNames = new HashMap<>();
        
        nickNames.put("matthew", "matt");
        nickNames.put("michael", "mix");
        nickNames.put("arthur", "artie");

        System.out.println(nickNames.get("matthew"));
        System.out.println(nickNames.get("michael"));
        System.out.println(nickNames.get("arthur"));
    }
}
