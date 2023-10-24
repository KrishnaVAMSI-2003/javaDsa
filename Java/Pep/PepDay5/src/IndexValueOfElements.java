// Guvvala krishna Vamsi, Reg No: 12008526

import java.util.Scanner;

public class IndexValueOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter array elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to search : ");
        int element = sc.nextInt();
        System.out.println("Entered element is found at index no: "+search(arr,element));
    }
    public static int search(int[] arr,int x) {
        for(int i=0;i<arr.length;i++) {
            if(x==arr[i])
                return i;
        }
        return -1;
    }
}
