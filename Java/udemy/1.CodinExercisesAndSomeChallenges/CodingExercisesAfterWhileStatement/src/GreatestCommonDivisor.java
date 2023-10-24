public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first<10 || second<10) {
            return -1;
        }
        if(first>second) {
            second = first+second;
            first = second-first;
            second = second-first;
        }
        int divisor = 2;
        int greatestCommonDivisor = 1;
        while(divisor<=second) {
            if(first%divisor==0 && second%divisor==0){
                greatestCommonDivisor = divisor;
            }
            divisor++;
        }
        return greatestCommonDivisor;
    }
}
