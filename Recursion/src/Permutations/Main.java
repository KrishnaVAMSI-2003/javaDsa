package Permutations;

public class Main {
    static void permutations(String str,String res) {
        if(str.isEmpty()) {
            System.out.println(res);
            return;
        }
        int len = res.length();
        for(int i=0;i<=len;i++) {
            String s = res.substring(0,i)+ str.charAt(0) + res.substring(i);
            permutations(str.substring(1),s);
        }
    }
    public static void main(String[] args) {
        permutations("abcd","");
    }
}
