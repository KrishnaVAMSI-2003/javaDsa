package oops;

public class Test2 {

    static int method() {
        int returnVal = 10;
        try {
            int num = 100/0;
        } catch (Exception e) {
            System.out.println(e);
            return returnVal;
        } finally {
            returnVal += 10;
            System.out.println("In final block "+returnVal);
        }
        return 30;
    }

    public static void main(String[] args) {
        System.out.println("In main method "+method());
    }
}
