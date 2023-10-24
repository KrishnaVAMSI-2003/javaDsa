// Guvvala Krishna Vamsi
// Reg no : 12008526

import java.util.Scanner;

public class MaxAndMinOfArray {
    public static void maxAndMinOfArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("No of elements in the array = ");
        int n = scan.nextInt();
        scan.nextLine();
        int[] array = new int[n];
        for(int i = 0;i<n;i++) {
            System.out.println("Enter element number "+i+1+" : ");
            array[i] = scan.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(array[j]>array[j+1]){
                    array[j] = array[j]+array[j+1];
                    array[j+1] = array[j] - array[j+1];
                    array[j] -= array[j + 1];
                }
            }
        }
        System.out.println("Maximum number = "+array[n-1]);
        System.out.println("Minimum number = "+array[0]);
    }
}
