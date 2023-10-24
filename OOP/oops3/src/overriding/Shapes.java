package overriding;

public class Shapes {
    int num =10;
    void area(){
        System.out.println("In shapes");
    }
}

class Circle extends Shapes {
    void area() {
        System.out.println("In circle");
    }
}
class Square extends Shapes {
    void area(int n) {
        System.out.println("In Square");
    }
}
class Triangle extends Shapes {
    int num = 20;
    void area(int n) {
        System.out.println("In Triangle");
    }
    void height() {

    }
}
