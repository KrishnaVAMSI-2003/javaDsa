public class InfiniteArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{2,3,5,7,9,11,15,19,21,25,27,29,33,35,37,39,41,43,47,49,50,51,52,53,54,56,68,69,70,71,73,75,77,78,79,80}; //Assume this as an infinite array
        int trg = 39;
        int start=0,end=3;
        while(true) {
            if(arr[start]<=trg && arr[end]>=trg) {
                break;
            }
            start=end+1;
            end+=end*2;
        }
        int index=-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if(arr[mid]==trg) {
                index=mid;
                break;
            } else if (arr[mid]>trg) {
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        System.out.println(index+" "+arr[15]);
    }
}
