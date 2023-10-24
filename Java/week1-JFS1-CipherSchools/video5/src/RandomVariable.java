import java.util.Random;
import java.util.Scanner;

public class RandomVariable {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            Random rd = new Random();
            int computerChoice = rd.nextInt(20);
            System.out.println("Computer Chooice : "+computerChoice);
            for(int i=1;i<=6;i++) {
                System.out.println("Guess a anumber between 0 and 20");
                int userChoice = sc.nextInt();
                if(userChoice>computerChoice) {
                    System.out.println("Your guess is too high");
                } else if (userChoice<computerChoice) {
                    System.out.println("Your guess is too low");
                } else {
                    System.out.println("Gotcha! You guessed it right!!");
                    break;
                }
            }
        }
}
