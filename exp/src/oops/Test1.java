package oops;

class Exp {
    private int a;
    Exp() {
        this.a = 10;
    }
    int getA() {
        return this.a;
    }
    static Exp test1() {
        return new Exp();
    }
}

public class Test1 {
    public static void main(String[] args) {
        Exp obj = Exp.test1();
        System.out.println(obj.getA());
    }
}