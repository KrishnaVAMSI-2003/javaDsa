public class LargestPrime {
    public static int getLargestPrime(int number){
        int largestPrime=-1;
        if(number<2) {
            return -1;
        }
        int count=0;
        for(int i=2;i<=number/2;i++) {
            if(number%i==0){
                count++;
            }
        }
        if(count==0){
            return number;
        }
        count=0;
        for(int i=2;i<=number/2;i++) {
            if(number%i==0){
                for(int j=2;j<=i/2;j++) {
                    if(i%j==0){
                        count++;
                    }
                }
                if(count==0){
                    largestPrime=i;
                }
            }
        }
        return largestPrime;
    }
}