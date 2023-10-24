package Singleton;

import java.io.PrintStream;

import static p1.Hello.greet;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
    }
}