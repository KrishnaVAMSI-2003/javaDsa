// Guvvala Krishna Vamsi,  Reg No: 12008526
import java.util.Scanner;
public class Legostack {
    public static void legoStack() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int firstIndex = 0, lastIndex = n-1,count=0;
        int lastMax = Math.max(arr[0], arr[n-1]);
        for(int i=0;i<n;i++){
            if(arr[firstIndex]>arr[lastIndex] && arr[firstIndex]<=lastMax){
                lastMax = arr[firstIndex];
                firstIndex++;
                count++;
            } else if (arr[firstIndex]<arr[lastIndex] && arr[lastIndex]<=lastMax) {
                lastMax = arr[lastIndex];
                lastIndex--;
                count++;
            } else if(arr[firstIndex]==arr[lastIndex] && arr[firstIndex]<=lastMax) {
                if(firstIndex==lastIndex) {
                    count++;
                    break;
                } else {
                    lastMax = arr[firstIndex];
                    firstIndex++;
                    count++;
                }
            }
        }
        if(count==n)
            System.out.println("Possible");
        else
            System.out.println("Impossible");
    }
}

/*
import java.util.Scanner;
public class Legostack {
    public static void legoStack() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int firstIndex = 0, lastIndex = n-1;
        int lastMax = Math.max(arr[0], arr[n-1]);
        for(int i=0;i<n;i++){
            if(arr[firstIndex]>arr[lastIndex] && arr[firstIndex]<=lastMax){
                lastMax = arr[i];
                arr[firstIndex]=0;
                firstIndex++;
            } else if (arr[firstIndex]<arr[lastIndex] && arr[lastIndex]<=lastMax) {
                lastMax = arr[n-1-i];
                arr[lastIndex]=0;
                lastIndex--;
            } else if(arr[firstIndex]==arr[lastIndex] && arr[firstIndex]<=lastMax) {
                arr[firstIndex]=0;
                firstIndex++;
                arr[lastIndex]=0;
                lastIndex--;
            }
        }
    }
}

 */