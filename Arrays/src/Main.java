import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(10);
        al.add(7);
        al.add(4);
        al.add(5);
        al.add(8);
        al.add(2,3);
        System.out.println(al);
    }
}