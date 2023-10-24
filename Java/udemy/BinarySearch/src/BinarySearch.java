public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{9,9,7,6,5,4,3,2,1};
        int x = 1;
        System.out.println(index(arr,x));
    }
    private static int index(int[] arr, int x){
        int start = 0;
        int end = arr.length-1;
        int res = -1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(x<arr[mid]) {
                start = mid+1;
            } else if (x>arr[mid]) {
                end = mid-1;
            } else {
                res=mid;
                end=end-1;
            }
        }
        return res;
    }
}
