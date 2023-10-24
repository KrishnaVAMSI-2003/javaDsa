// Guvvala Krishna Vamsi, Reg no: 12008526
// Program to remove all elements of treemap
import java.util.TreeMap;

public class RemoveAllElementsOfTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put("sun","Sunday");
        treeMap.put("mon","Monday");
        treeMap.put("tue","Tuesday");
        treeMap.put("wed","Wednesday");
        treeMap.put("thu","Thursday");
        treeMap.put("fri","Friday");
        treeMap.put("sat","Saturday");
        System.out.println("Treemap = "+treeMap);
        treeMap.clear();
        System.out.println("Tree map after removing all elements = "+treeMap+" \n empty...");
    }
}
