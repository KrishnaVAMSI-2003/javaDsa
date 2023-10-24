import java.util.Scanner;

public class MinimumElement {

    private static int readInteger() {
        Scanner sc = new Scanner(System.in);
        int noOfElements = sc.nextInt();
        return noOfElements;
    }

    private static int[] readElements(int noOfElements) {
        int[] array = new int[noOfElements];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<noOfElements;i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for(int i=0;i<array.length-1;i++) {
            if(min>array[i+1]) {
                min = array[i+1];
            }
        }
        return min;
    }
}
