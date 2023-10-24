// Guvvala Krishna Vamsi,  Reg no: 12008526

import java.util.LinkedList;

public class RetriveFirstElementLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("iPhone");
        list.add("Airpods");
        list.add("iPad");
        list.add("Macbook");
        System.out.println("List elements = "+list);
        String firstElement = list.peekFirst();
        System.out.println("First element = "+firstElement);
        System.out.println("List elements after retrieveing first element = "+list);
    }
}
