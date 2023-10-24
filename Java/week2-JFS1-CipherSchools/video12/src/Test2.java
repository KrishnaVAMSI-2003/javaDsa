class App{
    App() {
        System.out.println("Constructor of App");
    }
    App(int num) {
        System.out.println(num);
    }
}
public class Test2 extends App{
    Test2() {
        super(20);
        System.out.println("Constructor of Test2");
    }

    public static void main(String[] args) {
        new Test2();
    }
}
