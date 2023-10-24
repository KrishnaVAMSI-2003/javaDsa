//kadane's algoritm
public class MaximumSubarray {
    public static void maximumSubarray(int[] arr) {
        int sum = arr[0];
        int max = sum;
        int st = 0;
        int end = 0;
        for(int i=1;i<arr.length;i++) {
            if (sum < 0) {
                sum = 0;
                st = i;
            }
            sum += arr[i];
            if (sum > max) {
                max = sum;
                end = i;
            }
        }
        System.out.printf("Max subarray sum : %d\nSub Array :",max);
        for(int i=st;i<=end;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println("\nLength : "+(end-st+1));
    }

    public static void main(String[] args) {
        //int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr = {5,4,-1,7,8};
        maximumSubarray(arr);
    }
}
