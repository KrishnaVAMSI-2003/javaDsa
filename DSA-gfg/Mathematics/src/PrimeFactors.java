public class PrimeFactors {
    public static void primeFactors(int n) {
        if(n==1) return;
        for(int i=2;i<=3;i++) {
            while(n%i==0) {
                System.out.println(i);
                n/=i;
            }
        }
        for(int i=5;i*i<n;i+=6) {
            while(n%i==0) {
                System.out.println(i);
                n/=i;
            }
            while (n%i+2==0){
                System.out.println(i+2);
                n/=i+2;
            }
        }
        if(n>3) {
            System.out.println(n);
        }
    }
}


/*public class PrimeFactors {
    public static void primeFactors(int n) {
        int num = 2;
        while(num<=n){
            if(isPrime(n)){
                System.out.println(n);
                break;
            }
            else if(isPrime(num) && n%num==0){
                System.out.println(num);
                n/=num;
            } else
                num++;
        }
    }
    public static boolean isPrime(int n) {
        if (n==1)
            return false;
        else if(n==2 || n==3)
            return true;
        else {
            if(n%2==0 || n%3==0)
                return false;
            else {
                for (int i=5;i*i<n;i+=6) {
                    if(n%i==0 || n%i+2==0)
                        return false;
                }
            }
        }
        return true;
    }
}*/


/*
public class PrimeFactors {
    public static void primeFactors(int n) {
        for(int i=2;i*i<=n/2;i++){
            if(isPrime(i)) {
                int x = i;
                while(n % x == 0) {
                    System.out.println(i);
                    x *= i;
                }
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n==1)
            return false;
        else if(n==2 || n==3)
            return true;
        else {
            if(n%2==0 || n%3==0)
                return false;
            else {
                for (int i=5;i*i<n;i+=6) {
                    if(n%i==0 || n%i+2==0)
                        return false;
                }
            }
        }
        return true;
    }
}
*/
