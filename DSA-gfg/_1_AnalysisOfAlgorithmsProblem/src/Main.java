import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for n : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("sum of first "+n+"natural numbers in fun1 = "+fun1(n));
        System.out.println("sum of first "+n+"natural numbers in fun2 = "+fun2(n));
        System.out.println("sum of first "+n+"natural numbers in fun3 = "+fun3(n));

        sc.close();
    }

    public static int fun1(int n) {
        return n*(n+1)/2;
    }

    public static int fun2(int n) {
        int sum = 0;
        for(int i=1;i<=n;i++) {
            sum += i;
        }
        return sum;
    }

    public static int fun3(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                sum++;
            }
        }
        return sum;
    }

    /* According to assymptotic analysis fun1 will take less time for larger inputs because it has constant order of
       growth (c1) which doesn't depend upon the input value "n". Whereas, fun2 has linear order of growth (c2*n + c3)
       which grows linearly w.r.t the input value "n". fun3 has quadratic order of growth (c4* n^2 + c5*n + c6) which
       grows quadratically w.r.t the input value "n".
    */
}