public class BankAccount {
    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    int getAccountNumber() {
        return this.accountNumber;
    }

    public int getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int deposit) {
        this.balance = this.balance+deposit;
        System.out.println("Amount deposited in your account succesfully!");
        System.out.println("Balance : "+this.balance);
    }

    public void withdraw(int withdraw) {
        if(withdraw>this.balance) {
            System.out.println("Insufficient funds! unable to withdraw");
        } else {
            this.balance = this.balance-withdraw;
            System.out.println("Amount withdrawn succesfully!");
            System.out.println("Balance : "+this.balance);
        }
    }
}
