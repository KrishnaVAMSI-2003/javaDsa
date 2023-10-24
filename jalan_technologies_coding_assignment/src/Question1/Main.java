package Question1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    //the main idea of this function is placing positive numbers at even indexes and negative indexes at odd places
    static void alternate(int[] arr) {

        int len = arr.length;
        if(arr.length <= 2) return;
        int p1 = 0;

        while(p1 < len) {
            if((p1%2==0 && arr[p1]>0) || (p1%2!=0 && arr[p1]<0)) {
                p1++;
                continue;
            }
            int p2 = p1;
            if(p1%2 == 0) {
                while(p2<len) {
                    if(arr[p2] > 0) break;
                    p2++;
                }
            } else {
                while(p2<len) {
                    if(arr[p2] < 0) break;
                    p2++;
                }
            }
            if(p2==len) break;
            //swapping the elements as per requirement
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
        }
    }

    public static void main(String[] args) {
        //Creating an instance of Scanner class, which can be used to take inputs from the user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array: ");
        //taking the size value from the user and storing it in a variable n
        int n = sc.nextInt();

        //creating an array of the desired length (n in this case)
        int[] arr = new int[n];

        System.out.println("Enter elements of array seperated by space or by pressing enter: ");
        //running the for loop to get the input values from the user
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        //clearing the input buffer, to avoid unnecessary bugs
        sc.nextLine();

        //calling the external "alternate"  function to alternate the positions of the array's values
        alternate(arr);

        //printing the array after alternating the positions
        System.out.println(Arrays.toString(arr));
        //closing the input stream, since it is no longer required
        sc.close();
    }
}