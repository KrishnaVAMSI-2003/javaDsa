import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int minimum = 0;
        int maximum=0;
        int number;
        int count=0;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter Number ");
            boolean hasNextInt = scanner.hasNextInt();
            if(!hasNextInt){
                break;
            }
            number = scanner.nextInt();
            if(count==0) {
                minimum = number;
                maximum = number;
            }
            if(number<minimum){
                minimum = number + number;
                number = minimum - number;
                minimum = minimum - number;
            }
            if(number>maximum) {
                maximum = number + number;
                number = maximum - number;
                maximum = maximum - number;
            }
            scanner.nextLine();
            count++;
        }
        System.out.println("Minimum = "+minimum+"\nMaximum = "+maximum);
        scanner.close();
    }
}