public class SecondLargestUsingSingleForloop {
    public static void secondLargest() {
        int[] arr = {1,4,2,7,3,8};
        int max = arr[1];
        int secMax = arr[0];
        if(secMax>max) {
            int temp = max;
            max = secMax;
            secMax=temp;
        }
        for(int i=2;i<arr.length;i++) {
            if(max<arr[i]) {
                secMax = max;
                max = arr[i];
            } else if (arr[i]<max&&secMax<arr[i]) {
                secMax=arr[i];
            }
        }
        System.out.println(secMax);
    }
}
/*
//Reetika Sharma 12019148

//Second largest element in an array

public class MyClass {

    public static void main(String args[]) {

        System.out.println(secondMax(new int[] {45, 103,67, 23, 89, 101}));

    }

    static int secondMax(int[] arr) {

        int max = Math.max(arr[0], arr[1]);

        int secondMax = Math.min(arr[0], arr[1]);

        for(int i = 2; i<arr.length; i++) {

            if(arr[i]>max) {

                secondMax = max;

                max=arr[i];

            }

            else if(arr[i]>secondMax&&arr[i]<max) secondMax = arr[i];

        }

        return secondMax;

    }

}
 */