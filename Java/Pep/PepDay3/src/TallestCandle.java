import java.util.Arrays;
public class TallestCandle {
    public static void tallestCandle() {
        int[] height = {1,4,7,3,7};
        Arrays.sort(height);
        int tallest = height[height.length-1];
        int count = 0;
        System.out.println("Tallest candle = "+tallest);
        for(int i=0;i<height.length;i++) {
            if(height[i]==tallest) {
                count++;
            }
        }
        System.out.println("frequency of tallest candle : "+count);
    }
}

/*import java.util.Scanner;

import java.util.Arrays;

public class day3 {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Enter the sizes of candles: ");

int[] array = new int[5];

for (int i = 0; i < array.length; i++) {

array[i] = sc.nextInt();

}

Arrays.sort(array);

int max = array[4];

int count = 0;

for (int i = 0; i < array.length; i++) {

if (max == array[i]) {

count++;

}

}

System.out.println("No of longest candles are: " + count);

sc.close();

}

}*/
