// Guvvala Krishna Vamsi, Reg no: 12008526
// this is the modified program which also reverses the elements of colors arraylist
import java.util.ArrayList;
import java.util.Scanner;

public class ColorsArrayList_1and2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<String>();
        System.out.println("No of colors : ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++) {
            colors.add(sc.next());
        }
        System.out.println(colors);
        addReverse(colors);
        System.out.println(colors);
    }
    public static void addReverse(ArrayList<String> colors) {
        ArrayList<String> reverse = new ArrayList<String>();
        for(int i=1;i<=colors.size();i++) {
            reverse.add(colors.get(colors.size()-i));
        }
        for (int i=0;i<colors.size();i++) {
            colors.add(reverse.get(i));
        }
    }
}
