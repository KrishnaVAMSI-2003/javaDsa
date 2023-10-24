public class Main {
    public static void main(String[] args) {
//        BankAccount myAccount = new BankAccount("1234",100000,"KV","kv@gmail.com","9392321");
//
//        myAccount.deposit(100000);
//        myAccount.withdraw(10000);

//        BankAccount kv = new BankAccount("GKV","gkv@gmail.com","99999");
//        kv.deposit(100000);
//        kv.withdraw(10000);

        VipCustomer gkv = new VipCustomer("kv",2000000);
        System.out.println("Name : "+gkv.getName());
        System.out.println("Credit Limit : "+gkv.getCreditLimit());
        System.out.println("Email : "+gkv.getEmailAddress());
    }
}