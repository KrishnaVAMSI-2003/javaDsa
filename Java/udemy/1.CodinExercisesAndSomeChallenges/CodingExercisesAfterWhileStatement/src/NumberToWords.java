public class NumberToWords {
    public static void numberToWords(int number) {
        if(number<0) {
            System.out.println("Invalid Value");
        }
        int count = getDigitCount(number);
        number = reverse(number);
        int remainder;
        while(count>0) {
            remainder = number%10;
            number = number/10;
            switch (remainder){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            count--;
        }
    }
    public static int reverse(int number) {
        int remainder;
        int reverse=0;
        boolean negative = false;
        if(number<0){
            number *= -1;
            negative = true;
        }
        while(number>0) {
            remainder = number%10;
            number=number/10;
            reverse = reverse*10+remainder;
        }
        if(negative){
            reverse *= -1;
        }
        return reverse;
    }
    public static int getDigitCount(int number) {
        if(number<0){
            return -1;
        }
        if(number==0){
            return 1;
        }
        int count = 0;
        while(number>0) {
            number = number/10;
            count++;
        }
        return count;
    }
}
