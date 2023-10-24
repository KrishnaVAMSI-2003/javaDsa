public class Main {
    public static void main(String[] args) {
//        int count =0;
//        while(count!=6) {
//            System.out.println("hello");
//            count++;
//        }
        int start = 10;
        int end = 20;
        int count=0;
        while(start<=end){
            if(isEvenNumber(start)){
                System.out.println(start+" is even");
                count++;
            }
            if(count==5){
                break;
            }
            start++;
        }
        System.out.println("Total no of even numbers = "+count);
    }
    public static boolean isEvenNumber(int number) {
        if(number%2==0){
            return true;
        }
        return false;
    }
}