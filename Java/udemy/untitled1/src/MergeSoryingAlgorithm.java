import java.util.Arrays;

public class MergeSoryingAlgorithm {
    public static void merge(int[] arr,int st, int mid, int end) {
        int[] arr1 = Arrays.copyOfRange(arr,st,mid+1);
        int[] arr2 = Arrays.copyOfRange(arr,mid+1,end+1);
        int i=0,j=0,k=st;
        while(i<arr1.length && j<arr2.length) {
            if(arr1[i]<arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length) {
            arr[k] = arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length) {
            arr[k] = arr2[j];
            k++;
            j++;
        }
    }
    public static void mergeSort(int[] arr, int st, int end) {
        if(st<end) {
            int mid=(st+end)/2;
            mergeSort(arr,st,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,st,mid,end);
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[] { 12, 11, 13, 5, 6, 7 };
        mergeSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
