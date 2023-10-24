package Permutations;

public class Dice {
    static void print(String per, int sum) {
        if(sum == 0) {
            System.out.println(per);
            return;
        }
        for(int i=1;i<=6 && i<=sum;i++) {
            print(per+i, sum-i);
        }
    }
    public static void main(String[] args) {
        print("",6);
    }
}
