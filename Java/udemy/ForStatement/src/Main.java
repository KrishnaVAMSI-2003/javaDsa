// challenge
public class Main {
    public static void main(String[] args) {
        //System.out.println("2 is prime : "+isPrime(4));
        int count=0;
        for(int i=20;i<=40;i++) {
            if(isPrime(i)) {
                count++;
                System.out.println(i+" is prime.");
            }
            if(count==3){
                break;
            }
        }
    }
    public static boolean isPrime(int num) {
        if(num==1) {
            return false;
        }
        for(int i=2;i<=num/2;i++) { //we can use i<=(long) Math.sqrt(num) instead of i<=num/2 for optimization so that the loop will run less no.of times
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
/*public class Main {
    public static void main(String[] args) {
        for(int i=8;i>=2;i--) {
            System.out.println("10,000 at "+i+"% interest = "+String.format("%.2f",calculateInterest(10000d,i)));
        }
    }
    public static double calculateInterest(double amount, double interestRate) {
        return (amount*(interestRate/100));
    }
}*/