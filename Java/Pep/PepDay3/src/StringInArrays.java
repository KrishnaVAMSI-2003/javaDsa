public class StringInArrays {
    public static void stringArray() {
        String name = "guvvala krishna vamsi";
        char[] nameArray = name.toCharArray();
        int score = 0;

        for(int i=0;i<nameArray.length;i++) {
            score+=nameArray[i];
        }
        System.out.println(score);
    }
}
