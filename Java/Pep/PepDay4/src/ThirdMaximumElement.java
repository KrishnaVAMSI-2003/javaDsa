// Guvvala Krishna Vamsi, Reg no: 12008526
import java.util.Scanner;
public class ThirdMaximumElement {
    public static void thirdMax() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArray = input.split(",");
        inputArray[0] = inputArray[0].replace("[","");
        inputArray[inputArray.length-1] = inputArray[inputArray.length-1].replace("]","");
        int[] values = new int[inputArray.length];
        for(int i=0;i<inputArray.length;i++) {
            inputArray[i] = inputArray[i].replace(" ","");
            values[i] = Integer.parseInt(inputArray[i]);
        }
        sort(values);
        int maxCount = 0;
        int secMaxCount=0;
        int max = max(values,maxCount);
        for(int i=0;i<values.length;i++) {
            if(max == values[i])
                maxCount++;
        }
        if(values.length>maxCount) {
            int secMax = max(values,maxCount);
            for(int i=0;i<values.length;i++) {
                if(secMax == values[i])
                    secMaxCount++;
            }
            if(values.length>(maxCount+secMaxCount)) {
                int thirdMax = max(values,(maxCount+secMaxCount));
                System.out.println("Third Max value = "+thirdMax);
            } else {
                System.out.println("The array doesn't have a third maximum element");
            }
        } else {
            System.out.println("The array doesn't have a third maximum element");
        }
    }

    public static void sort(int[] arr) {
        for(int i=0;i<arr.length-1;i++) {
            for(int j=0;j<arr.length-1;j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static int max(int[] arr,int count) {
        int max = arr[0];
        for (int i=0;i<arr.length-count;i++) {
            if(max<arr[i]) {
                max=arr[i];
            }
        }
        return max;
    }
}