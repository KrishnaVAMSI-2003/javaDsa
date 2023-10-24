// Guvvala Krishna Vamsi
import java.util.Scanner;

public class TriangleValidOrNot {
    public static void validTriangle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle : ");
        int firstSide = sc.nextInt();
        int secondSide = sc.nextInt();
        int thirdSide = sc.nextInt();
        if((firstSide+secondSide>thirdSide)&&(secondSide+thirdSide>firstSide)&&(firstSide+thirdSide>secondSide)) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }
    }
}
