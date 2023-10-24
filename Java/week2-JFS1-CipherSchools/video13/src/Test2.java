import java.util.InputMismatchException;
import java.util.Scanner;

public class Test2 {
    int n1,n2,result;
    Scanner sc = new Scanner(System.in);
    void calculate() {
        try {
            System.out.println("Enter first Number");
            n1 = sc.nextInt();
            System.out.println("Enter second Number");
            n2 = sc.nextInt();

            if(n2==0) {
                //Testing Perspective!!!
                throw new ArithmeticException();
            }

            result = n1 / n2;
        }
        catch(InputMismatchException inp) {
            System.out.println("IME Detected");
        }
        catch(ArithmeticException AE) {
            System.out.println("AE detected");
        }
        catch(Exception e){
            System.out.println("Ouch! Exception Detected!"+e.getMessage());
            e.printStackTrace();
        }
        finally{
            System.out.println("The divivsion is "+result);
        }
    }

    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.calculate();
    }
}
