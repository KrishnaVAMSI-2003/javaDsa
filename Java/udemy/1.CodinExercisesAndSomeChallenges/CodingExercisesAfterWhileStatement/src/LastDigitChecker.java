public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1,int num2, int num3) {
        if(num1<10 || num1>1000 || num2<10 || num2>1000 || num3<10 || num3>1000) {
            return false;
        }
        int lastNum1 = num1%10;
        int lastNum2 = num2%10;
        int lastNum3 = num3%10;
        if(lastNum3!=lastNum1 && lastNum3!=lastNum2 && lastNum1!=lastNum2) {
            return false;
        }
        return true;
    }
    public static boolean isValid(int number) {
        if(number<10 || number>1000) {
            return false;
        }
        return true;
    }
}
