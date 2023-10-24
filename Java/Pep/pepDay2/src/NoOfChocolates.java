// Guvvala Krishna Vamsi, Reg no : 12008526
import java.util.Scanner;

public class NoOfChocolates {
    public static void noOfChocolates() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(",");
        int m = Integer.parseInt(arr[0]);
        int c = Integer.parseInt(arr[1]);
        int chocolates = m/c;
        int addChocolates = 0;
        int wrappers = chocolates;
        while(true) {
            addChocolates = addChocolates+wrappers/3;
            wrappers = wrappers%3+wrappers/3;
            if(wrappers<3) {
                break;
            }
        }
        System.out.println(chocolates+addChocolates);
    }
}
