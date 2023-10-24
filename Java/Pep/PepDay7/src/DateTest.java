// Guvvala Krishna Vamsi,  Reg no: 12008526
class Date {
    int month;
    int day;
    int year;
    Date(int month,int day,int year) {
        setMonth(month); // just experimenting by initializing using set method
        this.day  = day;
        this.year = year;
    }
    void setMonth(int month) {
        this.month = month;
    }
    int getMonth() {
        return month;
    }
    void setDay(int day) {
        this.day = day;
    }
    int getDay() {
        return day;
    }
    public void setYear(int year) {
        this.year = year;
    }
    int getYear() {
        return year;
    }
    void displayDate() {
        System.out.println(this.month+"/"+this.day+"/"+this.year);
    }
}
// Guvvala Krishna Vamsi,  Reg no: 12008526
public class DateTest {
    public static void main(String[] args) {
        Date obj = new Date(01,19,2023);
        obj.displayDate();
    }
}
