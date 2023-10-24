package St;

import java.util.Scanner;

public class TrianglePattern {
    static void trianglePattern(int num) {
        print(num, 0);
    }

    static void print(int row, int col) {
        if(row==1) {
            System.out.print("*");
            return;
        }
        if(col<row){
            print(row, col+1);
            System.out.print("*");
        } else {
            print(row-1,0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        trianglePattern(num);
    }
}
