package QuickSort;

import java.util.Arrays;

public class Main {
    static void quickSort(int[] nums, int low, int high) {
        if(low>=high) return;
        int st = low;
        int end = high;
        int mid = st+(end-st)/2;
        int pivot = nums[mid];
        while(st<=end){
            while(nums[st]<pivot){
                st++;
            }
            while(nums[end]>pivot){
                end--;
            }
            if(st<=end){
                int temp = nums[st];
                nums[st] = nums[end];
                nums[end] = temp;
                st++;
                end--;
            }
        }
        quickSort(nums,low,end);
        quickSort(nums,st,high);
    }
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,1,5,4};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}