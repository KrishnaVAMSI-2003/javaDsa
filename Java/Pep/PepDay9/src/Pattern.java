public class Pattern {
    public static void main(String[] args) {
        for(int i=1,k=0;i<=9;i++) {
            if(i>5){
                k+=2;
            }
            for(int j = 1;j<=i-k && j>0 ;j++) {
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
