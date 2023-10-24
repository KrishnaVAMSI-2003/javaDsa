// Guvvala Krishna Vamsi, Reg no: 12008526
// Program to convert hashset to treeset
import java.util.HashSet;
import java.util.TreeSet;

public class HashsetToTreeset {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("iPhone");
        hashSet.add("Airpods");
        hashSet.add("iPad");
        hashSet.add("Macbook");
        System.out.println("HashSet = "+hashSet);
        TreeSet<String> treeSet = new TreeSet<String>(hashSet);
        System.out.println("Converted TreeSet = "+treeSet);
    }
}
