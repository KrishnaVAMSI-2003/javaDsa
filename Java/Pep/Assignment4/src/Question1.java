import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of elements : ");
        int n= sc.nextInt();
        System.out.println("Enter elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            for(int i=0;i<n-1;i++) {
                if(arr[i]==0) {
                    arr[i]=arr[i+1];
                    arr[i+1]=0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
