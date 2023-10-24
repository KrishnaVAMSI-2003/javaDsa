import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How long is your Burp?");
        int burpLength = sc.nextInt();
        String msg = "";
        for(int i=1;i<=burpLength;i++) {
            msg+="r";
        }
        System.out.println("Bu"+msg+"p");
    }
}
