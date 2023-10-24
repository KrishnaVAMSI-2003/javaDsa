// Guvvala krishna Vamsi, Reg No: 12008526

import java.util.Scanner;

public class ThirdMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of elements in array = ");
        int size = sc.nextInt();
        System.out.println("Enter elements of the array : ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++) {
            arr[i] = sc.nextInt();
        }
        int max=arr[0], secMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;
        for(int i=0;i<size;i++) {
            if(max<arr[i]) {
                thirdMax = secMax;
                secMax = max;
                max = arr[i];
            } else if (secMax<arr[i]) {
                thirdMax = secMax;
                secMax = arr[i];
            } else if (thirdMax<arr[i]) {
                thirdMax = arr[i];
            }
        }
        System.out.println("Third Max = "+thirdMax);
    }
}
