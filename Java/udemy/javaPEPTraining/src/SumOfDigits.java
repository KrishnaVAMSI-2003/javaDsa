//Guvvala Krishna Vamsi
//Reg no : 12008526


import java.util.Scanner;

public class SumOfDigits {
    public static void sumOfDigits() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = scan.nextInt();
        int sum = 0;
        int unitDigit;
        while (number!=0) {
            unitDigit = number%10;
            sum+=unitDigit;
            number=number/10;
        }
        System.out.println("Sum = "+sum);
    }
}