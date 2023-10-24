// Guvvala krishna Vamsi, Reg No: 12008526

import java.util.Scanner;

public class MedianOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of first array : ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter first array elements : ");
        for(int i=0;i<size1;i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Size of second array : ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size1];
        System.out.println("Enter second array elements : ");
        for(int i=0;i<size2;i++) {
            arr2[i] = sc.nextInt();
        }
        float arr1Sum = sumOfElements(arr1), arr2Sum = sumOfElements(arr2), median = (arr1Sum+arr2Sum)/(size1+size2);
        System.out.println("Median = "+median);
    }
    public static float sumOfElements(int[] arr) {
        float sum=0;
        for(int i=0;i<arr.length;i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
