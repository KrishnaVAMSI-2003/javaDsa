// Guvvala Krishna Vamsi, Reg no: 12008526
class Invoice {
    String partNo;
    String partDescription;
    int quantity;
    double price;
    Invoice(String partNo, String partDescription, int quantity, double price) {
        this.partNo = partNo;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price = price;
    }
    void setPartNo(String partNo) {
        this.partNo = partNo;
    }
    String getPartNo() {
        return this.partNo;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    double getInvoice() {
        if(quantity<0) {
            quantity=0;
        } else if (price<0) {
            price=0.0;
        }
        return this.quantity*this.price;
    }
}
public class InvoiceTest {
    public static void main(String[] args) {
        Invoice obj1 = new Invoice("123","mobile",2,79999);
        System.out.println("part no: "+obj1.partNo+" \ndescription: "+obj1.partDescription+" \nquantity: "+obj1.quantity+" \nprice: "+obj1.price+" \nInvoice: "+obj1.getInvoice());
    }
}
