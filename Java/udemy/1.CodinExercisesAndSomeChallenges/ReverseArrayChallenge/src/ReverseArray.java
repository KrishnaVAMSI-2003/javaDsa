import java.util.Arrays;

public class ReverseArray {
    public ReverseArray(int[] array) {
        reverse(array);
    }

    private static void reverse(int[] array) {
        int[] newArray = Arrays.copyOf(array,array.length);
        for(int i=0;i<array.length/2;i++) {
            array[i] = array[array.length-1-i]+array[i];
            array[array.length-1-i] = array[i]-array[array.length-1-i];
            array[i] = array[i]-array[array.length-1-i];
        }
        System.out.println("Array = "+ Arrays.toString(newArray));
        System.out.println("Reversed array = "+ Arrays.toString(array));
    }
}
