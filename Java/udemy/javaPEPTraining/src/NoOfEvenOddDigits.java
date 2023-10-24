// Guvvala Krishna Vamsi
import java.util.Scanner;

public class NoOfEvenOddDigits {
    public static void noOfEvenOddDigits() {
        int noOfZeroes = 0;
        int noOfEvenDigits =0;
        int noOfOddDigits = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a four digit number : ");
        int number = scan.nextInt();
        scan.nextLine();
        int digit = number;
        for(int i=0;i<4;i++) {
            digit = number%10;
            number = number/10;
            if(digit == 0) {
                noOfZeroes++;
            } else if (digit%2==0) {
                noOfEvenDigits++;
            } else {
                noOfOddDigits++;
            }
        }
        System.out.println("no of zeroes = "+noOfZeroes);
        System.out.println("no of even digits = "+noOfEvenDigits);
        System.out.println("no of odd digits = "+noOfOddDigits);
    }
}