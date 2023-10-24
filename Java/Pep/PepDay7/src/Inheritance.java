class Father {
    Father() {
        System.out.println("Constructor of father(base) class");
    }
    static void foodHabit() {
        System.out.println("Likes salty");
    }
}
class Son extends Father{
    Son() {
        System.out.println("Constructor of son(derived) class");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Son obj = new Son();
        obj.foodHabit();
        Father.foodHabit();
    }
}
