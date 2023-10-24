// Guvvala Krishna Vamsi,  Reg no: 12008526
import java.text.DecimalFormat;
class SavingsAccount {
    static int annualInterestRate;
    private double savingsBalance;
    SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    double getSavingsBalance() {
        return savingsBalance;
    }
    static void modifyInterestRate(int interest) {
        annualInterestRate= interest;
    }
    void monthlyInterest() {
        double monthInterest = savingsBalance*annualInterestRate/12;
        savingsBalance=savingsBalance+monthInterest;
    }
}
// Guvvala Krishna Vamsi,  Reg no: 12008526
public class SavingsAccountTest {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(4);
        saver1.monthlyInterest();
        saver2.monthlyInterest();
        DecimalFormat df = new DecimalFormat("#.00");
        String saver1Balance = df.format(saver1.getSavingsBalance());
        String saver2Balance = df.format(saver2.getSavingsBalance());
        System.out.println("Saver1 balance after adding monthly interest = "+saver1Balance);
        System.out.println("Saver2 balance after adding monthly interest = "+saver2Balance);
        SavingsAccount.modifyInterestRate(5);
        saver1.monthlyInterest();
        saver2.monthlyInterest();
        saver1Balance = df.format(saver1.getSavingsBalance());
        saver2Balance = df.format(saver2.getSavingsBalance());
        System.out.println("Saver1 balance after adding monthly interest = "+saver1Balance);
        System.out.println("Saver2 balance after adding monthly interest = "+saver2Balance);
    }
}
