package p1;

public class Main {
    public static void main(String[] args) {
        Hello obj = new Hello();
        System.out.println(Hello.num);

        Main fun = new Main();
        fun.fun2();
    }
    static void fun1(){
        Main obj = new Main();
        obj.fun2();
    }
    void fun2() {

    }
}
