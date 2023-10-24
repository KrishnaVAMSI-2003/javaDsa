public class FloorOfANumber {
    public static void main(String[] args) {
        int[] arr = new int[] {2,5,7,9,15,27,29,35};
        int n=13;
        System.out.println(floor(arr,n));
    }
    static int floor(int[] arr,int trg) {
        int start=0,end = arr.length-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if(arr[mid]<trg) {
                if(arr[mid+1]>trg) return arr[mid];
                else start=mid+1;
            } else if (arr[mid]>trg) {
                end=mid-1;
            } else {
                return arr[mid];
            }
        }
        return arr[start];
    }
}
