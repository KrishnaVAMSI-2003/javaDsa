//Inheritance
public class Furniture {
    int height;
    int width;
    void display(String item) {
        System.out.println(item+" Width "+width+" Height "+height);
    }
    public static void main(String[] args) {
        Chair neelKamal = new Chair();
        neelKamal.foo();
    }
}
class Chair  extends Furniture {
    void foo(){
        width = 10;
        height=20;
        display("Chair");
    }
}
class Table  extends Furniture {
    void foo(){
        width = 30;
        height=50;
        display("Table");
    }
}
class Almiro  extends Furniture {
    void foo(){
        width = 100;
        height=200;
        display("Almiro");
    }
}

