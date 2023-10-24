public class RecursiveBinarySearch {
    public static int binary(int[] arr,int st,int end, int target) {
        if(st<=end) {
            int mid = st+(end-st)/2;
            if(arr[mid]==target) {
                return mid;
            } else if (arr[mid]>target) {
                return binary(arr,st,mid-1,target);
            } else {
                return binary(arr,mid+1,end,target);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[] {2,3,4,6,7,8,9,10};
        int target = 5;
        System.out.println(binary(arr,0,arr.length-1,target));
    }
}
