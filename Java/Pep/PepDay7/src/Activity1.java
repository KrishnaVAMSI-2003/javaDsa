import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

class Products {
    int productId;
    String productName;
    int price;
    String category;

    public Products(int productId, String productName, int price, String category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.category = category;
    }
}

public class Activity1 {
    public static void main(String[] args) {

        Products p1 = new Products(123,"Aphone",1,"iapple");
        Products p2 = new Products(124,"Bphone",2,"japple");
        Products p3 = new Products(125,"Cphone",3,"kapple");
        Products p4 = new Products(126,"Dphone",4,"lapple");
        Products[] arr = new Products[] {p1,p2,p3,p4};
        Stream<Products> productsStream = Arrays.stream(arr);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter category : ");
        String cat = sc.nextLine();
        Stream<Products> filteredStream = productsStream.filter(i->i.category.equals(cat));
        filteredStream.forEach(i-> System.out.println("id "+i.productId+" name "+i.productName+" price "+i.price+" category "+i.category));
    }
}
