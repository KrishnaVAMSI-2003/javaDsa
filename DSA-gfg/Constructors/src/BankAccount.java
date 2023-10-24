public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public BankAccount() {
        this("default",0,"default","default","default");
        System.out.println("Empty Constructor");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String customerEmail, String customerPhone) {
//        setAccountNumber(accountNumber);
//        setBalance(balance);
//        setCustomerName(customerName);
//        setCustomerEmail(customerEmail);
//        setCustomerPhone(customerPhone);
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhone) {
        this("9999",100000,customerName,customerEmail,customerPhone);
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
