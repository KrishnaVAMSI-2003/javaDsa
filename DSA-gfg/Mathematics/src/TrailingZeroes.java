import java.util.Scanner;

public class TrailingZeroes extends Factorial{
    public void trailingZeroes() {
        int x;
        int count=0;
        int noOfTrailingZeroes = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        boolean hasNextInt = sc.hasNextInt();
        if(hasNextInt) {
            x = sc.nextInt();
//            int factorial = super.calculate(x);
//            System.out.println(factorial);
//            while(factorial%10 == 0) {
//                noOfTrailingZeroes++;
//                factorial = factorial/10;
//            } // time complexity of this solution is theta(n)
            while(x!=0) {
                x=x/5;
                noOfTrailingZeroes += x;
            } // time complexity of this solution is theta(log n)
            System.out.println("No of trailing zeroes in the factoral of entered number is : "+noOfTrailingZeroes);
        } else {
            System.out.println("Enter a valid number");
        }
    }
}