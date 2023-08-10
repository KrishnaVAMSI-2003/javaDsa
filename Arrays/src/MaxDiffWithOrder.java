public class MaxDiffWithOrder {
    public static int maxDiffWithOrder(int[] arr){
        int max = arr[1] - arr[0];
        int min = arr[0];
        for(int i=1; i<arr.length;i++){
            max = Math.max(max, arr[i]-min);
            min = Math.min(min, arr[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        //int[] arr = {2, 3, 10, 6, 4, 8, 1};
        int[] arr = {7, 9, 5, 6, 3, 2};
        System.out.println(maxDiffWithOrder(arr));
    }
}
