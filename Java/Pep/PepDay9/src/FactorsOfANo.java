import java.util.Scanner;

public class FactorsOfANo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no : ");
        int num = sc.nextInt();
        System.out.println("Factors of entered number = ");
        if(num>0) {
            for(int i=1;i<=num/2;i++) {
                if(num%i==0) {
                    System.out.print(i+" ");
                }
            }
            System.out.println(num);
        } else {
            System.out.println("Invalid number");
        }
    }
}
