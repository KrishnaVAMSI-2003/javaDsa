public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int num=0;
        if(bigCount<0 || smallCount<0 || goal<0) {
            return false;
        }
        int sum = bigCount*5 + smallCount;
        if(sum<goal) {
            return false;
        }
        if(goal%5==0 && bigCount*5>=goal){
            return true;
        } else if (smallCount>=goal) {
            return true;
        } else if (bigCount*5 < goal && (goal-bigCount*5)<=smallCount) {
            return true;
        } else if (bigCount*5>goal) {
            for(int i=1;i<bigCount;i++){
                if((bigCount-i)*5<=goal){
                    num = i;
                    break;
                }
            }
            if((bigCount-num)*5 < goal && (goal-(bigCount-num)*5)<=smallCount) {
                return true;
            }
        }
        return false;
    }
}
