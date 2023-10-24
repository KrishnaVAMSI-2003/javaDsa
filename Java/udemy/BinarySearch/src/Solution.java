class Solution {
    public static int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int first=-1,last=-1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(target>nums[mid]) {
                start = mid+1;
            } else if(target<nums[mid]) {
                end = mid-1;
            } else {
                first = mid;
                end=mid-1;
            }
        }
        start = 0;
        end = nums.length-1;
        while(start<=end) {
            int mid = start+(end-start)/2;
            if(target>nums[mid]) {
                start = mid+1;
            } else if(target<nums[mid]) {
                end = mid-1;
            } else {
                last = mid;
                start=mid+1;
            }
        }
        int[] arr = {first,last};
        return arr;
    }
}