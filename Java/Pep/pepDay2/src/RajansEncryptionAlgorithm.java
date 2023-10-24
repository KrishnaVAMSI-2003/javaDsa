// Guvvala Krishna Vamsi,  Reg no : 12008526
import java.util.Scanner;
public class RajansEncryptionAlgorithm {
    public static void rajansEncryptionAlgorithm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input = ");
        String input = sc.next();
        char[] ch = input.toCharArray();
        String rev = "";
        for(int i=ch.length-1;i>=0;i--) {
            rev+=ch[i];
        }
        char[] revCharArray = rev.toCharArray();
        String encrypted = "";
        for(int i=0;i<revCharArray.length;i++) {
            if(revCharArray[i] =='a') {
                encrypted += 0;
            } else if (revCharArray[i] =='e') {
                encrypted +=1;
            } else if (revCharArray[i] =='i') {
                encrypted +=2;
            } else if (revCharArray[i] =='o') {
                encrypted +=3;
            } else if (revCharArray[i] =='u') {
                encrypted +=4;
            } else {
                encrypted+=revCharArray[i];
            }
        }
        encrypted+="aca";
        System.out.println(encrypted);
    }
}
