import java.util.Scanner;
public class DigitsTest {
    public static void main(String[] args) {
        double noOfevendigits = 0;
        double noOfodddigits = 0;
        double noOfzeros = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any ten digit number");
        double number=sc.nextDouble();
        System.out.println(number);
        for(double i=0;i<10;i++) {
            int digit = (int)number%10;
            number = number/10;
            if(digit==0) {
                noOfzeros++;
            }else if (digit%2==0) {
                noOfevendigits++;
            } else {
                noOfodddigits++;
            }
        }
        System.out.println("no of zeros ="+noOfzeros);
        System.out.println("no of even digits ="+noOfevendigits);
        System.out.println("no of odd digits ="+noOfodddigits);
    }
}