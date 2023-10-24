// Guvvala Krishna Vamsi, Reg no:12008526
class Employee {
    String fName;
    String lName;
    double salary;

    public Employee(String fName, String lName, double salary) {
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getfName() {
        return fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
    public String getlName() {
        return lName;
    }

    // Guvvala Krishna Vamsi, Reg no:12008526
    public void setSalary(double salary) {
        if(salary<0)
            this.salary = 0.0;
        else
            this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
    public void increment() {
        salary = salary+salary/10;
    }
}
public class Employeetest {
    public static void main(String[] args) {
        Employee obj1 = new Employee("Krishna","Vamsi",300000);
        Employee obj2 = new Employee("Guvvala", "Krishna Vamsi",400000);
        System.out.println("Yearly salary of "+obj1.fName+" "+obj1.lName+" = "+(obj1.salary*12.0));
        System.out.println("Yearly salary of "+obj2.fName+" "+obj2.lName+" = "+(obj2.salary*12.0));
        obj1.increment();
        obj2.increment();
        System.out.println("After increment Yearly salary of "+obj1.fName+" "+obj1.lName+" = "+(obj1.salary*12.0));
        System.out.println("After increment Yearly salary of "+obj2.fName+" "+obj2.lName+" = "+(obj2.salary*12.0));
    }
}
