import java.util.Arrays;

public class ProductExceptItself {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4};
        int[] newArr = new int[arr.length];
        for(int i=0;i< arr.length;i++) {
            newArr[i]=1;
            for(int j=0;j<arr.length;j++){
                if(i!=j){
                    newArr[i]*=arr[j];
                }
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
