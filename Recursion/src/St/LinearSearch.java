package St;

import java.util.ArrayList;

public class LinearSearch {
    static int linearSearch(int[] arr, int target) {
        System.out.println(searchAll(arr,target,0));
        System.out.println(searchAll(arr,target,0,new ArrayList<>()));
        return search(arr,target,0);
    }

    static int search(int[] arr, int target, int n){
        if(n==arr.length) return -1;
        if(arr[n]==target) return n;
        return search(arr,target,n+1);
    }
    static ArrayList<Integer> searchAll(int[] arr, int target, int n, ArrayList<Integer> list){
        if(n==arr.length) return list;
        if(arr[n]==target) list.add(n);
        searchAll(arr,target,n+1,list);
        return list;
    }
    static ArrayList<Integer> searchAll(int[] arr, int target, int n){
        ArrayList<Integer> list = new ArrayList<>();
        if(n==arr.length) return list;
        if(arr[n]==target) list.add(n);
        list.addAll(searchAll(arr,target,n+1));
        return list;
    }
    public static void main(String[] args) {
        int target = 5;
        System.out.println(linearSearch(new int[]{4,1,2,3,4,5,542,5,4,2,54,2},target));
    }
}
