public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number<0){
            return -1;
        }
        int lastDigit = number%10;
        int remainder = 0;
        int reverse = 0;
        while(number>0) {
            remainder = number%10;
            number = number / 10;
            reverse = reverse*10 + remainder;
        }
        int firstdigit = reverse%10;
        return firstdigit+lastDigit;
    }
}
