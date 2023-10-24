package St;

public class ArrSortedOrNot {
    static boolean sortedOrNot(int[] arr){
        return sorted(arr, arr.length-1);
    }
    static boolean sorted(int[] arr, int n){
        if(n==1) return arr[1]>arr[0];
        return sorted(arr,n-1) && arr[n]>arr[n-1];
    }
    public static void main(String[] args) {
        System.out.println(sortedOrNot(new int[]{9,1,25,43,34,3,9}));
    }
}
