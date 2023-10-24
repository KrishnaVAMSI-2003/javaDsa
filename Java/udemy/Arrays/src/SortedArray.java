import java.util.Scanner;

public class SortedArray {
    public static int[] getIntegers(int size) {
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<size;i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i=0;i<array.length;i++) {
            System.out.println("Element "+i+" contents "+array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        boolean flag = true;

        while(flag) {
            flag = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < array[i + 1]) {
                    array[i] = array[i] + array[i + 1];
                    array[i + 1] = array[i] - array[i + 1];
                    array[i] = array[i] - array[i + 1];
                    flag = true;
                }
            }
        }
        return array;
    }
}
