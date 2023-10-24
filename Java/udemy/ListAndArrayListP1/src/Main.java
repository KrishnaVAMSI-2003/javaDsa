public class Main {
    public static void main(String[] args) {
        GroceryList groceryList = new GroceryList();
        groceryList.addGroceryItem("milk");
        groceryList.addGroceryItem("cheese");
        groceryList.addGroceryItem("butter");
        groceryList.printGroceryList();
        groceryList.addGroceryItem("bread");
        groceryList.printGroceryList();
        groceryList.modifyGroceryList(1,"sugar");
        groceryList.printGroceryList();
        groceryList.removeElement(2);
        groceryList.printGroceryList();
    }
}


//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    private static Scanner sc = new Scanner(System.in);
//    private static int[] baseArray = new int[10];
//    public static void main(String[] args) {
//        System.out.println("Enter 10 elements : ");
//        getArray();
//        printArray(baseArray);
//        reSize();
////        System.out.println("size of the array after resized "+baseArray.length);
////        getArray();
//        baseArray[10] = 11;
//        baseArray[11] = 12;
//        printArray(baseArray);
//    }
//    private static void getArray() {
//        for(int i=0;i<baseArray.length;i++) {
//            baseArray[i] = sc.nextInt();
//        }
//    }
//
//    private static void printArray(int[] baseArray) {
//        System.out.println("base array of "+baseArray.length+" elements : "+ Arrays.toString(baseArray));
//    }
//
//    private static void reSize() {
//        int[] tempArray = baseArray;
//        baseArray = new int[12];
//        for(int i=0;i<tempArray.length;i++) {
//            baseArray[i] = tempArray[i];
//        }
//    }
//}