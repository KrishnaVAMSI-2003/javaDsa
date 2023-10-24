public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if(number<0) {
            return -1;
        }
        int remainder = 0;
        int reverse = 0;
        int sum = 0;
        while(number>0) {
            remainder = number%10;
            number = number / 10;
            if(remainder%2==0){
                sum+=remainder;
            }
        }
        return sum;
    }
}
