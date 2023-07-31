import java.util.HashSet;
//import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        //constant time complexity
        // for adding, searching and deleting an element i.e. O(1)

        //creating
        HashSet<Integer> set = new HashSet<>();

        //adding
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        //size
        System.out.println("size of set = "+set.size());

        //print all elements
        System.out.println(set);

        //searching
        if(set.contains(1)) System.out.println("SET CONTAINS 1");

        //delete
        set.remove(1);
        if(!set.contains(1)) System.out.println("removed 1");

        //iterator
//        Iterator it = set.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        for(Integer integer : set){
            System.out.println(integer);
        }
    }
}