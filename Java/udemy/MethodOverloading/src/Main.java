/*public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("KV",100);
        System.out.println("new score = "+newScore);
        calculateScore(99);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player "+playerName+" scored "+score+" points");
        return score*1000;
    }
    public static int calculateScore(int score) {
        System.out.println("unnamed player scored "+score+" points");
        return score*1000;
    }
    public static int calculateScore() {
        System.out.println("No name and no score");
        return 1000;
    }
}*/

// Chalenge
public class Main {
    public static void main(String[] args) {
        double convetedCM = calcFeetAndInchesToCentimeters(10,2);
        System.out.println("cm in first method = "+convetedCM);
        convetedCM = calcFeetAndInchesToCentimeters(65);
        System.out.println("cm in second method = "+convetedCM);
        System.out.println("if -1.0 is displayed, it indicates that the input given is invalid");
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet<0 || inches<0 || inches>12) {
            return -1;
        }
        return ((feet*12)+inches)*2.54;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches<0) {
            return -1;
        }
        double feet = (int) (inches/12);
        double inch = inches%12;
        return calcFeetAndInchesToCentimeters(feet, inch);

    }
}