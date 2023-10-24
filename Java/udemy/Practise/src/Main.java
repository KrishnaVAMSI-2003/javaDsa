import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Full Name : ");
        String name = sc.nextLine();
        System.out.println("Enter your contact number : ");
        String contact = sc.nextLine();
        System.out.println("Enter your age : ");
        float age = sc.nextFloat();
        String msg = String.format("Hello! %s your contact number is %s and your age is %.0f",name,contact,age);
        System.out.println(msg);
        System.out.println("Hello! "+name+" your contact number is "+contact+" and you age is  "+age);
    }
}
