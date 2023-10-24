
import java.util.Scanner;
public class SwappingByCallByReference {
    public static void swappingByReference() {
        Scanner sc = new Scanner(System.in);
        Initialize first = new Initialize(sc.nextInt());
        Initialize second = new Initialize(sc.nextInt());
        swap(first,second);
        System.out.println(first.variable+" "+ second.variable);
    }
    public static void swap(Initialize first, Initialize second) {
        int temp = first.variable;
        first.variable = second.variable;
        second.variable = temp;
    }
}
class Initialize {
    int variable;
    public Initialize(int value) {
        this.variable = value;
    }
}

//import java.util.Scanner;
//
//public class SwappingByCallByReference {
//    public static void swappingByCallByReference() {
//        int[] arr = new int[2];
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter first element : ");
//        arr[0] = scan.nextInt();
//        System.out.println("Enter second element : ");
//        arr[1] = scan.nextInt();
//        swap(arr);
//        System.out.println("After swapping -------- ");
//        System.out.println("first element = "+arr[0]);
//        System.out.println("second element = "+arr[1]);
//    }
//    public static void swap(int[] arr) {
//        int temp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = temp;
//    }
//}


// swapping by declaring the variables as global static
//import java.util.Scanner;
//public class SwappingByCallByReference {
//    static int a;
//    static int b;
//    public static void swappingByCallByReference() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter first element : ");
//        a = scan.nextInt();
//        System.out.println("Enter second element : ");
//        b = scan.nextInt();
//        swap();
//        System.out.println("After swapping----");
//        System.out.println("first element = "+a);
//        System.out.println("second element = "+b);
//    }
//    public static void swap() {
//        int temp = a;
//        a=b;
//        b=temp;
//    }
//}
