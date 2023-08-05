public class KthBitIsSetOrNot {
    public boolean kthBitIsSetOrNot(int n, int k){
        //naive solution, the other method is running a loop that divides n by 2, then apply & on n and 1
//        int num = 1;
//        for(int i=1;i<k;i++){
//            num *= 2;
//        }
//        return (num & n) != 0;

        //better solution
        //return (n & (1<<k-1)) != 0;
        //or
        return ((n>>k-1) & 1) !=0;
    }
}
