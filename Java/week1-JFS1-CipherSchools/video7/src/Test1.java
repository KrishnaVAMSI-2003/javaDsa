interface olaCustomer {
    void bookCab();
    void findARide();
    void rentCab();
    void rateDriver();
    void scheduleCab();
    void cancelCab();
    void addMoneyToWallet();
    void raiseTicket();
    void signup();
    void signin();
}
interface olaDriver {
    void acceptBooking();
    void getCustomerLocation();
    void setAvailableStatus();
    void getMyCommission();
    void raiseMoneyTransferRequest();
    void callCustomer();
    void setUpYourVehicle();
    void customerFeedBack();
}
interface olaOwner {
    void getDriverRecords();
    void getReportByDriverID();
    void getReportByRegion();
    void getTotalRevenue();
    void getCustomersFeedback();
    void addDriver();
    void removeDriver();
    void changeDriverStatus();
}
public class Test1 implements olaOwner,olaDriver,olaCustomer{

    public static void main(String[] args) {
        olaCustomer cust = new Test1();
        olaDriver driver = new Test1();
        driver.acceptBooking();
    }

    @Override
    public void bookCab() {

    }

    @Override
    public void findARide() {

    }

    @Override
    public void rentCab() {

    }

    @Override
    public void rateDriver() {

    }

    @Override
    public void scheduleCab() {

    }

    @Override
    public void cancelCab() {

    }

    @Override
    public void addMoneyToWallet() {

    }

    @Override
    public void raiseTicket() {

    }

    @Override
    public void signup() {

    }

    @Override
    public void signin() {

    }

    @Override
    public void acceptBooking() {

    }

    @Override
    public void getCustomerLocation() {

    }

    @Override
    public void setAvailableStatus() {

    }

    @Override
    public void getMyCommission() {

    }

    @Override
    public void raiseMoneyTransferRequest() {

    }

    @Override
    public void callCustomer() {

    }

    @Override
    public void setUpYourVehicle() {

    }

    @Override
    public void customerFeedBack() {

    }

    @Override
    public void getDriverRecords() {

    }

    @Override
    public void getReportByDriverID() {

    }

    @Override
    public void getReportByRegion() {

    }

    @Override
    public void getTotalRevenue() {

    }

    @Override
    public void getCustomersFeedback() {

    }

    @Override
    public void addDriver() {

    }

    @Override
    public void removeDriver() {

    }

    @Override
    public void changeDriverStatus() {

    }
}
