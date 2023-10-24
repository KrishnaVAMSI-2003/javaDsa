import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {3,2,5,1,4,7};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    public static int[] mergeSort(int[] arr) {
        if(arr.length==1) {
            return arr;
        }
        int mid=arr.length/2;
        int[] first = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] second = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(first,second);
    }
    public static int[] merge(int[] arr1,int[] arr2) {
        int i=0,j=0,k=0;
        int[] mergedArr = new int[arr1.length+arr2.length];
        while(i<arr1.length && j< arr2.length) {
            if(arr1[i]<arr2[j]) {
                mergedArr[k] = arr1[i];
                i++;
            } else {
                mergedArr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length) {
            mergedArr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length) {
            mergedArr[k]=arr2[j];
            j++;
            k++;
        }
        return mergedArr;
        
    }
}