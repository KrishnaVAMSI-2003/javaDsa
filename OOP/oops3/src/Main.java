public class Main {
    public static void main(String[] args) {
        Class obj = new Class();
        Class.Class1.greet();
    }
    static void hello(){

    }
    static void hello(int num){

    }
}

class Class{
    class Class1{
        Class1(){

        }
        static void greet(){
            System.out.println("Hellloooooooooooo");
        }
    }
    class Class2 extends Class1{
        Class2(){

        }
    }
}