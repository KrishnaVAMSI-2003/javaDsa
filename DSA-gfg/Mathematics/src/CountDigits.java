import java.util.Scanner;

public class CountDigits {
    public void countDigits() {
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        boolean hasNextInt = sc.hasNextInt();
        if(hasNextInt) {
            int x = sc.nextInt();
            while(x!=0) {
                count++;
                x = x/10;
            }
            System.out.println("No of digits in the entered number is :"+count);
        } else {
            System.out.println("Enter a valid number");
        }
    }
}
