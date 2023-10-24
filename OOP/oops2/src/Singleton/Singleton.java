package Singleton;

public class Singleton {
    private Singleton(){
        System.out.println("Instance created");
    }
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
            return instance;
        }else {
            System.out.println("instance has already been created");
            return null;
        }
    }
}
