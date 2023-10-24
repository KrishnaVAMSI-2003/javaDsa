import java.util.Arrays;

public class InsertionSort {
    static void insert(int arr[],int i)
    {
        // Your code here
        for(int j=0;j<=i;j++) {
            if(arr[i+1]<arr[j]){
                int temp=arr[j];
                arr[j]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
    //Function to sort the array using insertion sort algorithm.
    public void insertionSort(int arr[], int n)
    {
        //code here
        for(int i=0;i<n-1;i++) {
            insert(arr,i);
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,3,6,2,7,8};
        InsertionSort obj = new InsertionSort();
        obj.insertionSort(arr,6);
        System.out.println(Arrays.toString(arr));
    }
}
