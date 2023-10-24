/*
public class Prime {
    public static void isPrime(int a) {
        int count = 0;
        if(a==1) {
            count++;
        }
        for(int i=2;i*i<=a;i++) {
            if(a%i==0) {
                count++;
                break;
            }
        }
        if(count==0) {
            System.out.println("Entered number is a prime number");
        } else {
            System.out.println("Entered number is not a prime number");
        }
    }
}
*/
public class Prime {
    public static void isPrime(int a) {
        int count = 0;
        if(a==1)
            count++;
        else if(a==2 || a==3)
            System.out.println("Prime number");
        else {
            if(a%2==0 || a%3==0)
                count++;
            else {
                for (int i = 5; i * i <= a; i += 6) {
                    if (a % i == 0 || a % (i + 2) == 0)
                        count++;
                }
            }
        }
        if(count==0) {
            System.out.println("Entered number is a prime number");
        } else {
            System.out.println("Entered number is not a prime number");
        }
    }
}