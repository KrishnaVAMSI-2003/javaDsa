class Father {
    public final String lastName = "obroi";

    public void foodHabit() {
        System.out.println("I like Salty!!!");
    }
}
class Son extends Father{
    public void foodHabit() {
        System.out.println("I like Sweet");
    }
}
public class Test3 {
    public static void main(String[] args) {
        Father obj=null;
    }
}
