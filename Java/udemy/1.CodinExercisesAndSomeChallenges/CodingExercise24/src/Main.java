public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("subtract= " + calculator.getSubtractionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }
}
class SimpleCalculator {
    double firstNumber;
    double secondNumber;
    double getFirstNumber() {
        return firstNumber;
    }
    double getSecondNumber() {
        return secondNumber;
    }
    void setFirstNumber(double firstNumber) {
        this.firstNumber=firstNumber;
    }
    void setSecondNumber(double secondNumber) {
        this.secondNumber=secondNumber;
    }
    double getAdditionResult() {
        return firstNumber+secondNumber;
    }
    double getSubtractionResult() {
        return firstNumber-secondNumber;
    }
    double getMultiplicationResult() {
        return firstNumber*secondNumber;
    }
    double getDivisionResult() {
        return firstNumber/secondNumber;
    }
}