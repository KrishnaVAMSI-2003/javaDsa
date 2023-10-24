public class Main {
    public static void main(String[] args) {
        int value = 41;
        switch (value){
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            default:
                System.out.println("was not 1 or 2");
        }
        char charVariable = 'A';
        switch (charVariable) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C':
                System.out.println("C was found");
                break;
            case 'D':
                System.out.println("D was found");
                break;
            case 'E':
                System.out.println("E was found");
                break;
            default:
                System.out.println("not found");
                break;
        }
    }
}