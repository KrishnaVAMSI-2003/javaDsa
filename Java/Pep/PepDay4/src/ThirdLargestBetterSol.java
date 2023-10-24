// Guvvala Krishna Vamsi
import java.util.*;
public class ThirdLargestBetterSol {
    public static void thirdLargest() {
        Scanner sc = new Scanner(System.in);
        System.out.println("no of elements = ");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        System.out.println("Enter elements of the array : ");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0], secondMax = Integer.MIN_VALUE, thirdMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]>max) {
                thirdMax = secondMax;
                secondMax = max;
                max = arr[i];
            } else if (arr[i]>secondMax && arr[i]!=max) {
                thirdMax=secondMax;
                secondMax=arr[i];
            } else if(arr[i]>thirdMax && arr[i]!=secondMax && arr[i]!=max) {
                thirdMax = arr[i];
            }
        }
        if(thirdMax>Integer.MIN_VALUE) {
            System.out.println("Third Max = "+thirdMax);
        } else {
            System.out.println("The array doesn't have a third maximum element");
        }
    }
}
