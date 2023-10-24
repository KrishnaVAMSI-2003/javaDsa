public class Main {
    public static void main(String[] args) {
        double result = 1d+2d;
        System.out.println(" 1 + 2 = "+result);
        /*
        + : addition
        - : subtraction
        * : multiplication
        / : division
        % : remainder
         */

        // Abbreviating operators

        // result = result + 1 can be written as
        result++;
        System.out.println(result);

        result--;
        System.out.println(result);

        result += 2; //result = result+2
        System.out.println(result);

        result -=1;
        System.out.println(result);

        result *=5;
        System.out.println(result);

        result /=3;
        System.out.println(result);

        boolean boolValue = false;
        if(boolValue)
            System.out.println("Boolean value is false");
            System.out.println("As i have already said that Boolean value is false"); // this line gets executed cause we haven't added the code block '{}'

        int topScore = 100;
        if (topScore != 100) {              // we can use other operators like >,<,>=,...
            System.out.println("\nYou got the high score");
        }

        //ternary Operator
        boolean isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Operator challenge

        double firstVarible = 20.00d;
        double secondVariable = 80.00d;
        double newVariable = (firstVarible + secondVariable)*100d;
        double remainder = (int) (newVariable % 40d);
        boolean resultOfAboveSteps = (remainder == 0) ? true : false;
        System.out.println(resultOfAboveSteps);
        if (!resultOfAboveSteps) {
            System.out.println("Got some remainder");
        } //
    }
}