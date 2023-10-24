package LeetcodePOTD;

public class Aug27 {
    public static void main(String[] args) {
        int[] arr = {0,1,3,6,10,13,14};
        CanCross obj = new CanCross();
        System.out.println(obj.canCross(arr));
    }
}
class CanCross {
    boolean canCross(int[] stones) {
        return canCross(stones, 0, 1, 1);
    }
    boolean canCross(int[] stones,int presInd, int nxtInd,int jump) {
        if(presInd == stones.length-1) return true;
        if(presInd == stones.length-2) {
            return stones[presInd] + jump == stones[nxtInd];
        }
        boolean equal = false;
        boolean greater = false;
        if(stones[presInd] + jump == stones[nxtInd]) {
            boolean post = canCross(stones, nxtInd, nxtInd+1, jump+1);
            boolean pres = canCross(stones, nxtInd, nxtInd+1, jump);
            boolean prev = canCross(stones, nxtInd, nxtInd+1, jump-1);
            equal = prev || pres || post;
        }
        if(stones[presInd] + jump > stones[nxtInd]){
            for (int i = nxtInd+1; i < stones.length; i++) {
                if (stones[presInd] + jump < stones[i]) break;
                if (stones[presInd] + jump == stones[i]) {
                    greater = canCross(stones, presInd, i, jump);
                }
            }
        }
        return equal || greater;
    }
}