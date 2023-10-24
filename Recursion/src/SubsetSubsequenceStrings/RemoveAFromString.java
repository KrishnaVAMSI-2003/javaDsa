package SubsetSubsequenceStrings;

public class RemoveAFromString {
    static String removeA(String str) {
        if(str.isEmpty()) return "";
        if(str.charAt(0)=='a' || str.charAt(0)=='A') return removeA(str.substring(1));
        return str.charAt(0)+ removeA(str.substring(1));
    }
    public static void main(String[] args) {
        System.out.println(removeA("Krishna Vamsi"));
        System.out.println((int)'A');
    }
}
