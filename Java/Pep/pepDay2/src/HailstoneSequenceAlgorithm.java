//Guvvala Krishna Vamsi
//reg no 12008526
import java.util.Scanner;
public class HailstoneSequenceAlgorithm {
    public static void hailStoneSequenceAlgorithm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        while(n!=1){
            System.out.println(n);
            if(n%2!=0){
                n = n*3+1;
            } else{
                n/=2;
            }
        }
        System.out.println(n);
    }
}
