//challenge
public class Main {
    public static void main(String[] args) {
        int score = 1500;
        int highScorePosition = calculateHighScorePosition(score);
        displayHighScorePosition(String.valueOf(score),highScorePosition);

        score = 900;
        highScorePosition = calculateHighScorePosition(score);
        displayHighScorePosition(String.valueOf(score),highScorePosition);

        score = 400;
        highScorePosition = calculateHighScorePosition(score);
        displayHighScorePosition(String.valueOf(score),highScorePosition);

        score = 50;
        highScorePosition = calculateHighScorePosition(score);
        displayHighScorePosition(String.valueOf(score),highScorePosition);
    }
    public static void displayHighScorePosition(String playerName,int position) {
        System.out.println(playerName+" managed to get into position "+position+" on the high score table");
    }
    public static int calculateHighScorePosition(int score) {
        int position = 4;
        if (score>=1000) {
            position = 1;
        }else if (score>=500) {
            position = 2;
        }else if (score>=100) {
            position = 3;
        }
        return position;
    }
}



/*public class Main {
    public static void main(String[] args) {
        int finalScore = calculateScore(true,800,5,100);
        System.out.println("final score in first game = "+finalScore);
        finalScore = calculateScore(false,10000,8,200);
        System.out.println("final score in second game = "+finalScore);
    }
    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score+(levelCompleted*bonus);
            finalScore +=2000;
            return finalScore;  //once it enters if condition and gets here it gets out of this method and return's the value to main method
        }
        return -1; //
    }
}*/