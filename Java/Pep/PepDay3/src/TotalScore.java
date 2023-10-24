// Guvvala Krishna Vamsi
import java.util.Scanner;
public class TotalScore {
    public static void totalScore() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputArray = input.split(",");
        int totalScore = 0;
        if(inputArray.length>11) {
            totalScore = -1;
        } else {
            inputArray[0] = inputArray[0].replace("[","");
            inputArray[inputArray.length-1] = inputArray[inputArray.length-1].replace("]","");
            int[] arr = new int[inputArray.length];
            for(int i=0;i<inputArray.length;i++) {
                 totalScore += Integer.parseInt(inputArray[i]);
            }
        }
        System.out.println(totalScore);
    }
}
