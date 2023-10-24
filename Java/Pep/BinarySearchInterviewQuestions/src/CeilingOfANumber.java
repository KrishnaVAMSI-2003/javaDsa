public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = new int[] {2,5,7,9,15,27,29,35};
        int n=13, start=0,end=arr.length-1,ceiling=n;
        while(start<=end) {
            int mid=start+(end-start)/2;
            if(n<arr[mid]) {
                    ceiling=arr[mid];
                    end=mid-1;
            } else if (n>arr[mid]) {
                    start=mid+1;
            } else {
                ceiling=arr[mid];
            }
        }
        System.out.println(ceiling);
    }
}
