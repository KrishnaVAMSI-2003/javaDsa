import java.util.Scanner;
//
//public class Factorial {
//    public static void factorial() {
//        int factorial = 1;
//        int count = 1;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number : ");
//        boolean hasNextInt = sc.hasNextInt();
//        if(hasNextInt) {
//            int x = sc.nextInt();
//            while(count<=x) {
//                factorial *= count;
//                count++;
//            }
//            System.out.println("Factorial of the entered number is :"+factorial);
//        } else {
//            System.out.println("Enter a valid number");
//        }
//    }
//}

// Recursive solution


public class Factorial {
    public void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        boolean hasNextInt = sc.hasNextInt();
        if(hasNextInt) {
            int x = sc.nextInt();
            if(x>=0){
                System.out.println("Factorial of the entered number is :"+calculate(x));;

            }
        } else {
            System.out.println("Enter a valid number");
        }
    }
    public int calculate(int x) {
        if(x==1){
            return 1;
        }
        return (x*calculate(x-1));
    }
}
