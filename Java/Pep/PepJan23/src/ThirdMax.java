// Guvvala Krishna Vamsi, Reg No:12008526
import java.util.Arrays;
import java.util.Scanner;
public class ThirdMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++) {
            nums[i]=sc.nextInt();
        }
        int[] arr = thirdMax(nums);
        if(arr[1]>4) System.out.println("The array doesn't have a third maximum element");
        else System.out.println(arr[0]);
    }
    public static int[] thirdMax(int[] arr) {
        Arrays.sort(arr);
        int thirdmax = Integer.MIN_VALUE, count=0;
        for(int i=arr.length-2;i>=0;i--) {
            if(arr[i]!=arr[i+1]) {
                count++;
            }
            if(count==3) {
                thirdmax=arr[i+1];
                break;
            } else if(count==2 && i==0 && arr[i]!=arr[i+1]) {
                thirdmax = arr[i];
            }
            else if (i==0 && arr[i]==arr[i+1]) {
                count+=10;
            }
        }
        int[] newArr = new int[] {thirdmax,count};
        return newArr;                                  // 3rd/4th diff solution of this ques
    }
}
