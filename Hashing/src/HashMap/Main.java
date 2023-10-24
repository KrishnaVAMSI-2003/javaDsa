package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //creation
        //country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India",145);
        map.put("China",140);
        map.put("USA",30);

        //printing
        System.out.println(map);

        //updating values
        map.put("China",143);
        System.out.println(map);

        //lookup or search
        System.out.println("India is present in the map - "+map.containsKey("India"));

        //getting value of the key
        map.get("India");

        //iterating over hashmap
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() +" = "+ e.getValue());
        }

        for(String key : map.keySet()){
            System.out.println(key+" = "+map.get(key));
        }

        //remove a pair
        map.remove("China");
        System.out.println(map);
    }
}