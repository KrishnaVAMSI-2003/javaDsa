public class ArrayCoding {
    public static void main(String[] args) {
        int[] arr = new int[]{65,66,67,68};
        int n=65;
        for(int i=0;i<4;i++) {
            System.out.println(String.format("%d - %c",arr[i],(n+i)));
        }

    }
}
