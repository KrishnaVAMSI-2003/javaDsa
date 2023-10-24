public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if(num1<10 || num1>99 ||num2<10 || num2>99) {
            return false;
        }
        int unitNum1 = num1%10;
        int tenNum1 = num1/10;
        int unitNum2 = num2%10;
        int tenNum2 = num2/10;
        if(unitNum1==unitNum2 || unitNum1 ==tenNum2 || tenNum1==unitNum2 || tenNum1 ==tenNum2) {
            return true;
        }
        return false;
    }
}
