import java.util.*;
public class ItenaryFromTickets {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai","Delhi");
        map.put("Goa","Chennai");
        map.put("Delhi","Goa");
        HashSet<String> values = new HashSet<>();
        String point = "";
        for(String key : map.keySet()){
            values.add(map.get(key));
        }
        for(String key : map.keySet()){
            if(!values.contains(key)) {
                point = key;
                break;
            }
        }
        System.out.print(point);
        while(map.containsKey(point)){
            point = map.get(point);
            System.out.print(" -> "+point);
        }
    }
}