public class Main {
    static int divide(int a, int b) throws ArithmeticException{
        if(b==0) throw new ArithmeticException("Do not divide by zero");
        return a/b;
    }
    public static void main(String[] args) throws ArithmeticException{
        int a=10;
        int b=0;
        try {
            System.out.println(divide(a,b));
//            if(b==0){
//                throw new ArithmeticException("Do not divide by zero");
//            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This will always executes");
        }
    }
}