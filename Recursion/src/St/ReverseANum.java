package St;

public class ReverseANum {
    static int rev = 0;
    public static boolean reverse(int num){
//        if(num==0) return;
//        rev = (rev * 10) + (num % 10);
//        reverse(num/10);
        int digits = (int)Math.log10(num);
        return reverse2(num,digits) == num;
    }

    public static int reverse2(int num, int pow){
        if(num % 10 == num) return num;
        return (num%10 * (int)Math.pow(10,pow)) + reverse2(num/10, pow-1);
    }

    public static void main(String[] args) {
        System.out.println(reverse(1231));
    }
}
