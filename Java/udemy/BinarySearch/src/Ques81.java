public class Ques81 {
    public static int binarySearch(int[] nums,int target,int start,int end) {
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(target==nums[mid]) return mid;
            else if(target<nums[mid]) end=mid-1;
            else start=mid+1;
        }
        return -1;
    }
    public static boolean search(int[] nums, int target) {
        if(nums.length==1){
            if(nums[0]==target) return true;
            else return false;
        }
        int start =0, end = nums.length-1;
        while(start+1<end) {
            int mid=start+(end-start)/2;
            if(nums[start]<nums[end]) {
                start=end;
                break;
            }
            if(nums[start]==nums[mid] && nums[end]==nums[mid]){
                start++;
                end--;
            }else if(nums[start]<nums[mid]) start=mid;
            else if(nums[start]==nums[mid]){

            }
            else {
                end=mid;
            }
        }
        if(binarySearch(nums,target,0,start)!=-1 || binarySearch(nums,target,start,nums.length-1)!=-1) return true;
        return false;

    }

    public static void main(String[] args) {
        int[] nums = {3,1};
        System.out.println(search(nums,2));
    }
}
