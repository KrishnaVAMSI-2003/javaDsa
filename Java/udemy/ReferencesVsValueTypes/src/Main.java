import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        myIntValue++;
        System.out.println(anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;
        System.out.println("myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("AnotherArray = "+ Arrays.toString(anotherArray));
        anotherArray[0] = 1;

        System.out.println("after changing myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("after changing AnotherArray = "+ Arrays.toString(anotherArray));

        modifyArray(myIntArray);
        System.out.println("after modifying myIntArray = "+ Arrays.toString(myIntArray));
        System.out.println("after modifying AnotherArray = "+ Arrays.toString(anotherArray));
    }

    public static void modifyArray(int[] array) {
        array[1] = 2;
    }
}