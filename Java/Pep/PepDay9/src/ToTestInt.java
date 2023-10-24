// Exercise2
// Guvvala Krishna Vamsi,  Reg no: 12008526
interface Test {
    void square();
}
class Arithmetic implements Test{
    public void square() {
        int num = new java.util.Scanner(System.in).nextInt();
        System.out.println("Square of entered no : "+num*num);
    }
}
public class ToTestInt {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        obj.square();
    }
}
