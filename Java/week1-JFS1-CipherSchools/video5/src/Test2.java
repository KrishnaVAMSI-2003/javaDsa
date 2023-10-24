public class Test2 {
    public static void main(String[] args) {
        char ch ='A';
        // while
        while(ch<=90) {
            System.out.print(ch+" ");
            ch++;
        }
        System.out.println();
        //Do while
        ch = 'A';
        do{
            System.out.print(ch+" ");
            ch++;
        } while(ch<='Z');
    }
}
