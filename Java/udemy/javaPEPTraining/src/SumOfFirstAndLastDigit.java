

//Guvvala Krishna Vamsi
//Reg no : 12008526
import java.util.Scanner;

public class SumOfFirstAndLastDigit {
    public static void sumOfDigits() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scan.nextInt();
        int unitDigit=number%10;
        int firstDigit=0;
        while (number!=0) {
            firstDigit = number%10;
            number=number/10;
        }
        int sum = firstDigit+unitDigit;
        System.out.println("Sum = "+sum);
    }
}
