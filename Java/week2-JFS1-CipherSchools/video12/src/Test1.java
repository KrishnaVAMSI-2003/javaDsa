public class Test1 {
    // this keyword

    int arg=5;
    Test1(){
        System.out.println("Default constructor");
    }
    Test1(int arg) {
        this();
        this.arg=arg;
    }

    public static void main(String[] args) {
        int arg=10;
        Test1 obj = new Test1(10);
        System.out.println(obj.arg);
    }
}
