package Q2A2;

import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{-3,-1,2,5,-1,6,-8};
        int p1 = 0;
        int p2 = arr.length-1;
        while(p1<p2) {
            if(arr[p1]<0) {
                p1++;
                continue;
            }
            if(arr[p2]>0) {
                p2--;
                continue;
            }
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
//            if(arr[p1]<0) {
//                p1++;
//                continue;
//            }
//            int p2 = p1+1;
//            while(p2<arr.length) {
//                if(arr[p2]<0) break;
//                p2++;
//            }
//            if(p2==arr.length) break;
//            int temp = arr[p1];
//            arr[p1] = arr[p2];
//            arr[p2] = temp;
//            p1++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
