import java.util.Iterator;
import java.util.LinkedList;

public class Test0 {
    public static void main(String[] args) {
        LinkedList myll = new LinkedList();
        myll.add("IronMan");
        myll.add("Thor");
        myll.add("Hulk");
        myll.add("Loki");
//        System.out.println(myll.get(1));

        myll.addLast("Gamora");
        myll.addLast("AntMan");
        myll.add(2,"Natasha");

        Iterator it = myll.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("-----------------");
        System.out.println("Whos at the top "+myll.peek());
        System.out.println("Hey first one get out "+myll.poll());
        System.out.println("Whos standing at the last ! "+myll.pop());
        System.out.println("----------------------");
        it = myll.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
