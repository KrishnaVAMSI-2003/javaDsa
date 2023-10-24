package p1;

import java.io.PrintStream;

public class Hello {
    static int num;
    static {
        num = 10;
    }

    public static void greet(){
        PrintStream out = null;
        out.println("Hello");
    }
}
