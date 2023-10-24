import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<Product>();

        while(true) {
            System.out.println("Want to add : (y/n) ?");
            String inp = sc.nextLine();
            if(inp.charAt(0)=='n') break;
            Product p = new Product();
            System.out.println("product name : ");
            p.title=sc.nextLine();
            System.out.println("price : ");
            p.price=sc.nextInt();
            sc.nextLine();
            products.add(p);
        }
        System.out.println(products.get(0).title);
        int totalBill = 0;
        ArrayList<String> productsTitles = new ArrayList<String>();
        for (Product product : products) {
            totalBill += product.price;
            productsTitles.add(product.title);
        }
        productsTitles.sort(Comparator.naturalOrder());
        System.out.println("Total bill : "+totalBill);
        System.out.println("Products list in ascending order : "+productsTitles);
    }
}
class Product{
    String title;
    int price;

}
