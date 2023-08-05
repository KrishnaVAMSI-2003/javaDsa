import javax.sound.midi.Soundbank;

public class PowerSet {
    public static void powerSet() {
        String s = "abc";
        int n = 3;
        int subSets = (int) Math.pow(2,n);
        for(int i=0;i<subSets;i++) {
//            String str = "";
//            int setBit = 1;
//            int pos = 0;
//            while(setBit<=i){
//                if((setBit&i) != 0) str += s.charAt(pos);
//                setBit <<= 1;
//            }
//            System.out.println("set - "+str);
            for(int j=0;j<n;j++){
                if((i & 1<<j) !=0) System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
}
