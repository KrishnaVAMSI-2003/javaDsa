import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test0 {
    public static void main(String[] args) {
        ArrayList cart0 = new ArrayList();
        List cart1 = new ArrayList();
        cart0.add("Apple");
        cart0.add(100);
        cart0.add('c');


        // generic: type safe (homogeneous elements), it avoids type casting
        // and makes faster
        ArrayList<Integer> cart2 = new ArrayList<Integer>();
        cart2.add(100);
        cart2.add(800);

        ArrayList<String> states = new ArrayList<String>();
        states.add("California");
        states.add("Alabama");
        states.add("Alaska");
        states.add("Arkansas");
        System.out.println("Arraylist: "+states);

        // Accessing elements using .get() method
        String s = states.get(2);
        System.out.println("I got "+s);

        //Write loop for this

        System.out.println("Arraylist size :"+states.size());

        for(int i=0;i<states.size();i++) {
            System.out.println(states.get(i));
        }

        //update elements using .set() Method

        states.set(2,"Texas");
        System.out.println("after updation: "+states);

        // Removing elements using .remove() method

        String t = states.remove(3);
        System.out.println("State removed is : "+t);
        System.out.println("Arraylist after deletion : "+states);

        // Let us sort the List using .sort() method
        states.sort(Comparator.naturalOrder()); // A->Z
        System.out.println("Arraylist after sorting : "+states);

        // .contains() method
        System.out.println("Is NewYork There? "+states.contains("Newyork"));

        // get index of Element using .indexOf() method
        System.out.println("Texas is at : "+states.indexOf("Texas")+" Index");

        //you can check if list is empty or not using .isEmpty() method
        System.out.println("Is list Empty? "+states.isEmpty());

        states.removeAll(states);

        System.out.println("Is list Empty? "+states.isEmpty());


    }
}
