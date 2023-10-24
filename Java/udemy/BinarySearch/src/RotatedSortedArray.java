public class RotatedSortedArray {
    public static void main(String[] args) {
        Solution1 sol = new Solution1();
        sol.search();
    }
}
class Solution1 {
    public void search() {
        int[] nums = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int start=0;int end=nums.length-1;
        while(start+1<end) {
            int mid=start+(end-start)/2;
            if(nums[start]==nums[mid] && nums[end]==nums[mid]){
                start++;
                end--;
            }else if(nums[start]<nums[mid] || nums[start]==nums[mid]) start=mid;
            else {
                end=mid;
            }
        }                                                                                                                        //        while(start+1<end) {
                                                                                                                                //            int mid=start+(end-start)/2;
                                                                                                                                //            if(nums[start]>nums[mid]) {
                                                                                                                                //                end = mid;
                                                                                                                                //            } else {
                                                                                                                                //                start = mid;
                                                                                                                                //            }
                                                                                                                                //        }

        System.out.println(start);
    }
}