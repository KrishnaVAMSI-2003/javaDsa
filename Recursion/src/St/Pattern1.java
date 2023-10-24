package St;

public class Pattern1 {
    static void pattern1(int n) {
        print(n,0);
    }
    static void print(int row, int col) {
        if(row<1) return;
        if(row!=col) {
            print(row,col+1);
            System.out.print("*");
        } else {
            print(row-1,0);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(5);
    }
}
