import java.util.HashSet;
// import java.util.Iterator;

public class P1 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println("Size = "+set.size());
        System.out.println("Contains 1 = "+set.contains(1));
        System.out.println("set = "+set);
/*
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
*/
        for(int integer : set) {
            System.out.println(integer);
        }
        set.remove(1);
        System.out.println("After removing 1, set = "+set);
    }
}
