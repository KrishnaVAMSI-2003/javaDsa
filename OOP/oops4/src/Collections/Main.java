package Collections;

import java.util.LinkedList;
import java.util.List;

class Main {
    public static void main(String[] args) {
//        int[] arr1 = new int[10];
//        int[] arr2 = new int[31];
//        arr1=arr2;
//        System.out.println(arr1.length);
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(11);
        list.add(1,12);
        System.out.println(list);
    }
}
