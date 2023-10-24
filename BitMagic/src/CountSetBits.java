import java.util.Arrays;

public class CountSetBits {
    public static int countSetBits(int n){
        int count = 0;
        while(n>0) {
            //naive solution O(most significant bit)
//            count += n&1;
//            n >>=1;
            // Brian Kerningam's algorithm O(no of setBits)
            n = n & (n-1); // in n-1 set bit is 0 and the trailing bits are 1's ex: 40:10100  39:10011
            count++;
        }
        return count;
    }

    //lookup table solution
    int[] tbl = new int[256];
    void initialize(){
        tbl[0] = 0;
        for(int i=1; i<256;i++){
            tbl[i] = tbl[i & i-1] +1;
        }
    }
    CountSetBits(){
        initialize();
    }
    int countSetBitsLookup(int n){
        return tbl[n&255] + tbl[n>>8 & 255] + tbl[n>>16 &255] +tbl[n>>24];
    }
}
