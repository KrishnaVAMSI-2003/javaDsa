// In the range of 1-100
public class FunTask {
    public static void funTask() {
        for(int i=1;i<=100;i++) {
            if(i%3 == 0 && i%5 == 0) {
                System.out.println("Fun Task");
            } else if(i%3 == 0) {
                System.out.println("Fun");
            } else if (i%5 == 0) {
                System.out.println("Task");
            } else {
                System.out.println(i);
            }
        }
    }
}
