import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of elements : ");
        int n= sc.nextInt();
        System.out.println("Enter elements : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        largerThanNeighbours(arr);
    }
    static void largerThanNeighbours(int[] arr) {
        for(int i=1;i<arr.length-1;i++) {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
                System.out.println(i+" ");
            }
        }
    }
}
