import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        long avg = 0;
        int number;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            boolean hasNextInt = scanner.hasNextInt();
            if(!hasNextInt) {
                break;
            }
            number = scanner.nextInt();
            sum += number;
            scanner.nextLine();
            count++;
        }
        double average = (double) sum/count;
        avg = Math.round(average);
        System.out.println("SUM = "+sum+" AVG = "+avg);
        scanner.close();
    }
}
