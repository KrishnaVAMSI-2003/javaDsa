// Guvvala krishna Vamsi, Reg No: 12008526
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roman no : ");
        String romanNo = sc.next();
        romanNo = romanNo.toUpperCase();
        char[] arr = romanNo.toCharArray();
        int num = 0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]=='V') {
                num+=5;
            } else if (arr[i]=='X') {
                num+=10;
            } else if (arr[i]=='I' && (i+1)== arr.length) {
                num+=1;
            } else if (arr[i]=='I' && (arr[i+1]=='V' || arr[i+1]=='X')) {
                num-=1;
            } else if (arr[i]=='I') {
                num+=1;
            }
        }
        System.out.println("Integer = "+num);
    }
}
