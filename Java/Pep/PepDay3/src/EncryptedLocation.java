//Guvvala Krishna Vamsi, Reg no: 12008526
import java.util.Scanner;
public class EncryptedLocation {
    public static void encryptedLocation() {
        Scanner sc = new Scanner(System.in);
        String encMsg = sc.nextLine();
        char[] encArray = encMsg.toCharArray();
        String area = "";
        String city = "";
        for(int i=0;i<encArray.length;i+=2) {
            area +=encArray[i];
            city +=encArray[i+1];
        }
        area = area.replace("#","");
        city = city.replace("#","");
        System.out.println(area+","+city);
    }
}
