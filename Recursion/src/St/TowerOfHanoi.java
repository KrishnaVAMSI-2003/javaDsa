package St;

public class TowerOfHanoi{
    public static void toh(int N) {
        toh(N, 'A', 'C', 'B');
    }
    public static void toh(int N, char from, char to, char aux) {
        if(N==1) {
            System.out.println("Move disk "+ N + " from "+from+" to "+to);
            return;
        }
        toh(N-1, from, aux, to);
        System.out.println("Move disk "+N+" from "+from+" to "+to);
        toh(N-1, aux, to, from);
    }
    public static void main(String[] args) {
        int n = 3;
        toh(n);
    }
}

























//public class TowerOfHanoi {
//    public static int toh(int N, String from, String to, String aux) {
//        // Your code here
//        int count = 0;
//        if(N==1) {
//            System.out.println("move disk 1 from rod "+from+" to rod "+to);
//            return count+1;
//        }
//        int x = toh(N-1, from, aux, to);
//        System.out.println("move disk "+N+" from rod "+from+" to rod "+to);
//        int y = toh(N-1, aux, to, from);
//        return x+y+1;
//    }
//    public static void main(String[] args) {
//        System.out.println(toh(3,"a","c","b"));
//    }
//}
