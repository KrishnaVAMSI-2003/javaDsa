import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        HashSet myset = new HashSet();
        myset.add("green");
        myset.add("orange");
        myset.add("red");
        myset.add("green");
        myset.add("violet");
        System.out.println("HashSet : "+myset);

        LinkedHashSet lset = new LinkedHashSet();
        lset.add("green");
        lset.add("orange");
        lset.add("red");
        lset.add("green");
        lset.add("violet");
        System.out.println("LinkedHashSet : "+lset);

        TreeSet tset = new TreeSet();
        tset.add("green");
        tset.add("orange");
        tset.add("red");
        tset.add("green");
        tset.add("violet");
        System.out.println("TreeSet : "+tset);
    }
}
