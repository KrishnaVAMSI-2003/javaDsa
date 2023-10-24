import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your current speed : ");
        int speed = sc.nextInt();
        System.out.println("Is it your birthday? ");
        boolean bday = sc.nextBoolean();
        if(bday) {
            speed-=5;
        }
        if(speed>80) {
            System.out.println("High Ticket");
        } else if(speed<60) {
            System.out.println("No Ticket");
        } else {
            System.out.println("Mid Ticket");
        }
    }
}
