public class PowerOf2 {
    boolean isPowerOf2(int n) {
        //naive solution
//        while (n!=1){
//            if(n%2!=0) return false;
//            n/=2;
//        }
//        return true;

        //better solution using Brian Kerningam's algorithm
//        int noOfSetBits = 0;
//        while(n>0){
//            n &= n-1;
//            noOfSetBits++;
//        }
//        return noOfSetBits==1;
        if(n==0) return false;
        return (n & n-1)==0;
    }
}
