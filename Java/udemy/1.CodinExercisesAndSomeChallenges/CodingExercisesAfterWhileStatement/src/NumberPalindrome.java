public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if(number<0){
            number += -2*number;
        }
        int enteredNumber = number;
        int reverse=0;
        int remainder=0;
        while(number>0) {
            remainder=number%10;
            number=number/10;
            reverse=(reverse*10)+remainder;
        }
        if(reverse==enteredNumber) {
            return true;
        }
        return false;
    }
}
