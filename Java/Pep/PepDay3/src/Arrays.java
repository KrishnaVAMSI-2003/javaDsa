import java.util.Scanner;

public class Arrays {
    public static void arrays() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements : ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] grocery = new String[n];
        System.out.println("Enter grocery items : ");
        for(int i=0;i<n;i++) {
            grocery[i] = sc.next();
        }
        System.out.println("Entered items are \n");
        for(int i=0;i<n;i++) {
            System.out.println(String.format("Item number %d = %s",(i+1),grocery[i]));
        }
    }
}
