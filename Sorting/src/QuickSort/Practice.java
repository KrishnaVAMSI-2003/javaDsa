package QuickSort;

import java.util.Arrays;

public class Practice {
    public static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length-1);
    }
    public static void quickSort(int[] arr,int low, int high){
        if(low>=high) return;
        int st = low;
        int end = high;
        int mid = st + (end-st)/2;
        int pivot = arr[mid];
        while (st<=end) {
            while (arr[st]<pivot){
                st++;
            }
            while (arr[end]>pivot){
                end--;
            }
            if(st<=end){
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
        }
        quickSort(arr,low,end);
        quickSort(arr,st,high);
    }
    public static void main(String[] args) {
        int[] arr = {7,3,8,3,5,1,3,2,6,2};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
