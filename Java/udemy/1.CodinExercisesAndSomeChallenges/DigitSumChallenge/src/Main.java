public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(323276575));
    }
    private static int sumDigits(int number) {
        if(number<10) {
            return -1;
        }
        int remainder = 0;
        int sum=0;
        while(number>0){
            remainder = number%10;
            number=number/10;
            sum +=remainder;
        }
//        for(int i=1;number>0;i++) {
//            remainder = number%10;
//            number = number/10;
//            sum = sum+remainder;
//        }
        return sum;
    }
}