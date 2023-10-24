// Guvvala Krishna Vamsi,  Reg No: 12008526
import java.util.Arrays;
import java.util.Scanner;
public class SearchInUnsortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        sc.nextLine();
        String s = sc.nextLine();
        int target = Integer.parseInt(s);
        System.out.println(binarySearch(arr,target));
    }
    public static boolean binarySearch(int[] arr, int target) {
        Arrays.sort(arr);
        int start = 0, end = arr.length-1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(arr[mid]==target) {
                return true;
            } else if (arr[mid]<target) {
                start=mid+1;
            } else {
                end = mid-1;
            }
        }
        return false;
    }
}
