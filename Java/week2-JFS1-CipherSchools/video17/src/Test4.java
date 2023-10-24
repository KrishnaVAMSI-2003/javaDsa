import java.util.HashMap;
import java.util.Map;

public class Test4 {
    public static void main(String[] args) {
        HashMap<String, String> states = new HashMap<String, String>();

        //.put() method
        states.put("Tx","Texas");
        states.put("Al","Alabama");
        states.put("Ar","Arizona");
        states.put("Ca","California");
        System.out.println(states);
        for (Map.Entry<String, String> e : states.entrySet()) {
            System.out.println(e.getKey()+"-------"+e.getValue());
        }

    }
}
