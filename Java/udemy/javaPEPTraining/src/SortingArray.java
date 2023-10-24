import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void sortingArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("No of elements = ");
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++) {
            System.out.println("Enter element "+i+1+" : ");
            array[i] = scan.nextInt();
        }
        sort(array);
        System.out.println("Sorted array = "+ Arrays.toString(array));
    }
    public static void sort(int[] array) {
        for(int i=0;i<array.length-1;i++) {
            for(int j=0;j<array.length-1;j++) {
                if(array[j]>array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
