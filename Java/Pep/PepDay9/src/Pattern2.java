public class Pattern2 {
    public static void main(String[] args) {
        for(int i=9,k=4;i>0;i--) {
            if(i<5){
                k-=2;
            }
            for(int j = 1;j<=i-k && j>0 ;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}