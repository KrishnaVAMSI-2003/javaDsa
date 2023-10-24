import java.util.Arrays;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("No of columns : ");
        int col = sc.nextInt();
        System.out.println("No of rows : ");
        int rows = sc.nextInt();
        int[][] matrix = new int[rows][col];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<col;j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        int[] arr = new int[rows*col];
        int ind=0;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<col;j++) {
                arr[ind]=matrix[i][j];
                ind++;
            }
        }
        Arrays.sort(arr);
        ind=0;
        for(int i=0;i<rows;i++) {
            for(int j=0;j<col;j++) {
                matrix[i][j]=arr[ind];
                ind++;
            }
        }
        for(int i=0;i<rows;i++) {
            for(int j=0;j<col;j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}