package LeetcodePOTD;

public class Aug26 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2},
                {7,8},
                {4,5}
        };
        System.out.println(Solution.findLongestChain(arr));
    }
}
class Solution {
    public static int findLongestChain(int[][] pairs) {
        int max = 0;
        for(int i=0;i<pairs.length;i++) {
            int[] track = new int[pairs.length];
            int count = find(pairs, i, track, pairs[i]);
            if(count==pairs.length) return count;
            max = Math.max(count, max);
        }
        return max;
    }
    static int find(int[][] pairs, int index, int[] track, int[] arr) {
        if(track[index]==1) return 0;
        track[index] = 1;
        int max = 0;
        for(int i=0;i<pairs.length;i++) {
            int count = 0;
            if(arr[1]<pairs[i][0]) {
                count += find(pairs, i, track, pairs[i]);
                max = Math.max(max, count);
            }
        }
        track[index] = 0;
        return max+1;
    }
}