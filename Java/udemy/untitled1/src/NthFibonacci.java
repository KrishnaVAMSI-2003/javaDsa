public class NthFibonacci {
    public static void main(String[] args) {
        int b=5;
        System.out.println(f(b));
    }
    public static int f(int n) {
        if(n==0) return n;
        else if (n==1) {
            return n;
        }
        return f(n-1)+f(n-2);
    }
}
