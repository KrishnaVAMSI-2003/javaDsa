// Guvvala Krishna Vamsi, Reg no : 12008526
import java.util.Arrays;
import java.util.Scanner;
public class StoringPrimeNumbersInArray {
    public static void primeNumbersArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("No of elements = ");
        int n = scan.nextInt();
        System.out.println("Enter elements seperated by space : ");
        int[] arr=new int[n/2+1];
        int element;
        int index = 0;
        for(int i=0;i<n;i++) {
            int count=0;
            element = scan.nextInt();
            if(element==0||element==1) {
                count++;
            }
            for(int j=2;j*j<=element;j++) {
                if(element%j==0){
                    count++;
                }
            }
            if(count==0) {
                arr[index] = element;
                index++;
            }
        }
        int[] primeArr = new int[index];
        for(int i=0;i<index;i++) {
            primeArr[i] = arr[i];
        } System.out.println("Prime numbers array = "+ Arrays.toString(primeArr));
    }
}
