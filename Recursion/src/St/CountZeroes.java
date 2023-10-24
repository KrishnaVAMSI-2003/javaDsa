package St;

public class CountZeroes {
    static int countZeroes(int num) {
        if(num==0) return 0;
        if(num%10 == 0) return countZeroes(num/10)+1;
        return countZeroes(num/10);
    }

    public static void main(String[] args) {
        System.out.println(countZeroes(1020030));
    }
}
