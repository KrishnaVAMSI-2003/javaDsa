// Guvvala Krishna Vamsi, Reg No:12008526
interface A {
    void meth1();
    void meth2();
}
class MyClass implements A {
    public void meth1() {
        System.out.println("Method1 of interface A");
    }
    public void meth2() {
        System.out.println("Method2 of interface A");
    }
}
public class Exercise1 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.meth1();
        obj.meth2();
    }
}
