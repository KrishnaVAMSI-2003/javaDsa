package SubsetSubsequenceStrings;

import java.util.Arrays;

public class Practice {
    static void subSets(String str){
        subSets(str,"");
    }
    static void subSets(String str, String prev) {
        if(str.isEmpty()) {
            System.out.println(prev);
            return;
        }
        if(prev.isEmpty() || prev.charAt(prev.length()-1) != str.charAt(0)) subSets(str.substring(1), prev);
        subSets(str.substring(1),prev+str.charAt(0));
    }
    public static void main(String[] args) {
        //if there are duplicates write the string either ascending or descending order
        char[] chArr = "acba".toCharArray();
        Arrays.sort(chArr);
        String str = new String(chArr);
        System.out.println(str);
        subSets(str);
    }
}
