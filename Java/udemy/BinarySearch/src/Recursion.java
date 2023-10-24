public class Recursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int trg = 10;
        int x = binarySearch(arr,trg,0,arr.length-1);
        System.out.println(x);
    }
    public static int binarySearch(int[] arr,int trg,int start,int end) {
        if(start<=end) {
            int mid = start+(end-start)/2;
            if(trg<arr[mid]) {
                return binarySearch(arr,trg,start,mid-1);
            }
            else if (trg>arr[mid]) {
                return binarySearch(arr,trg,mid+1,end);
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}
