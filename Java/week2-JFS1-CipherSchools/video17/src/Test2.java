import java.util.*;
public class Test2 {
    public static void main(String[] args) {
        ArrayList myl = new ArrayList();
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<5;i++) {
            String item = sc.next();
            if(myl.contains(item)) {
                continue;
            }
            myl.add(item);
        }
        System.out.println(myl);
    }
}
