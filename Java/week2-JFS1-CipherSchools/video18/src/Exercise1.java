import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("No of products want to enter into shopping cart : ");
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<String> shoppingCart = new ArrayList<String>();
        for(int i=0;i<n;i++) {
            String item = sc.next();
            shoppingCart.add(item);
        }
        FileWriter f1 = new FileWriter("D:\\cart.txt",true);// using true appends data to the previous file instead of rplacing its data
        for(String s : shoppingCart) {
            f1.write(shoppingCart.indexOf(s)+"."+s+"\n");
        }
        f1.flush();
        f1.close();
        System.out.println("Products added successfully");
    }
}
