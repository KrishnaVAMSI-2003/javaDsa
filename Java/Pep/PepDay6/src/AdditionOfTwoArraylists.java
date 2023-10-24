// Guvvala Krishna Vamsi,  Reg no: 12008526
import java.util.ArrayList;
import java.util.Scanner;
public class AdditionOfTwoArraylists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of elements in first arraylist: ");
        int size1 = sc.nextInt();
        sc.nextLine();
        System.out.println("enter elements");
        ArrayList<String> arrayList1 = new ArrayList<String>();
        for(int i=0;i<size1;i++) {
            arrayList1.add(sc.nextLine());
        }
        System.out.println("No of elements in first arraylist: ");
        int size2 = sc.nextInt();
        sc.nextLine();
        System.out.println("enter elements");
        ArrayList<String> arrayList2 = new ArrayList<String>();
        for(int i=0;i<size2;i++) {
            arrayList2.add(sc.nextLine());
        }
        for(int i=0;i<size2;i++) {
            arrayList1.add(arrayList2.get(i));
        }
        System.out.println("Arraylist1 after adding second "+arrayList1);
    }
}
