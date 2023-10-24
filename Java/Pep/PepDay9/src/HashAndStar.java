import java.util.Scanner;
public class HashAndStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int hashCount = 0, starCount = 0;
        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)=='#') {
                hashCount++;
            } else if (s.charAt(i) == '*') {
                starCount++;
            }
        }
        System.out.println(hashCount-starCount);
    }
}
