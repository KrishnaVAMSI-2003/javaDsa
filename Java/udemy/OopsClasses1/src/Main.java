public class Main {
    public static void main(String[] args) {
//        Car porsche = new Car();
//        Car ferrari = new Car();
//
//        porsche.setModel("911");
//        System.out.println("Model is "+porsche.getModel());

        BankAccount object = new BankAccount();

        object.setBalance(1000);
        object.deposit(2000);
        object.withdraw(1500);
    }
}