package Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2};
        List<Integer> list = new ArrayList<>();
        swap(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}