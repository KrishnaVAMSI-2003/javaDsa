package SubsetSubsequenceStrings;

public class StringSubsets {
    static void subsets(String str){
        subsets(str,"");
    }
    static void subsets(String str,String prev) {
        if(str.isEmpty()) {
            System.out.println(prev);
            return;
        }
        subsets(str.substring(1),prev);
        subsets(str.substring(1),prev+str.charAt(0));
    }
    public static void main(String[] args) {
        subsets("abc");
    }
}
