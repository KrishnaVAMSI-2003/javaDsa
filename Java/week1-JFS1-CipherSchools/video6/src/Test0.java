public class Test0 {
    public static void main(String[] args) {
        Amazon customer = new Amazon();
        float payableAmount = customer.Transaction(1000);
        System.out.println("Total Payable = "+payableAmount);
    }
}
class  Amazon {
    float Transaction(float amt) {
        GPay gPayObj = new GPay();
        float totalAmount = amt+(amt*gPayObj.getTxnCharges());
        return totalAmount;
    }
}
class GPay {
    private float txnCharges = 0.05f;
    public void setTxnChargs(float newCharges) {
        if(newCharges<0.05f) {
            System.out.println("Invalid TxtCharge");
            return;
        }
        this.txnCharges=newCharges;
    }
    public float getTxnCharges() {
        return txnCharges;
    }
}