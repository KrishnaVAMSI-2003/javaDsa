import java.util.Scanner;
import java.text.DecimalFormat;
public class EmployeePayRoll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter BasicPay(salary): ");
        float basicPay = sc.nextInt();
        float hra = basicPay/10.0f;
        float da = basicPay/5.0f;
        if(basicPay<5000.0f){
            hra = basicPay/5.0f;
            da = basicPay*3.0f/10.0f;
        }
        float total = basicPay+hra+da;
        DecimalFormat df = new DecimalFormat("#.00");
        String totSalary = df.format(total);
        System.out.println("HRA = "+Math.round(hra)); // Math.round method to round off the value
        System.out.println(String.format("DA = %.2f",da));
        System.out.println("Total salary i.e. Gross Pay = "+totSalary); // using decimal format
        //System.out.println(String.format("Gross pay = %.2f",total));  // using String.format
    }
}
