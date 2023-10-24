// Example of Encapsulation


class Phonepe {
    private float serviceCharge=0.05f;
    float getServiceCharge() {
        return serviceCharge;
    }
    void setServiceCharge(float newCharge) {
        if(newCharge<.05f) {
            System.out.println("Service charge cannot be less than 5%");
            return;
        }
        serviceCharge=newCharge;
    }
}
class Customer {
    void pay(int bill) {
        Phonepe phonepe = new Phonepe();
        phonepe.setServiceCharge(0.01f);
        float phonpeCharge = bill* phonepe.getServiceCharge();
        float finalAmount = bill+phonpeCharge;
        System.out.println(String.format("Bill %s, Phonepe service charge %s, final amounnt %s,",bill,phonpeCharge,finalAmount));
    }
}
public class Encapsulation {

    public static void main(String[] args) {
        Customer cus = new Customer();
        cus.pay(100);
    }
}
