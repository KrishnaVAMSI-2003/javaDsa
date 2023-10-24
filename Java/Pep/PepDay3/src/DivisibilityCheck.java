// Guvvala Krishna Vamsi,    Reg no:12008526
import java.util.Scanner;
public class DivisibilityCheck {
    public static void divisibilityCheck() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String numString = input.replace(",","");
        int num = Integer.parseInt(numString);
        int numCopy = num;
        int count = 0;
        int[] arr = new int[numString.length()];
        for(int i=0;i<numString.length();i++){
            arr[i] = num%10;
            num = num/10;
        }
        for(int i=0;i<numString.length();i++) {
            if(numCopy%arr[i]!=0){
                count++;
            }
        }
        if(count==0)
            System.out.println("Happy Number");
        else
            System.out.println("Sad Number");
    }
}