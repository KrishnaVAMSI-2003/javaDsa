import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your year of birth : ");
        boolean hasNextInt = sc.hasNextInt();
        if(hasNextInt) {
            int year = sc.nextInt();
            System.out.println("Enter your age : ");
            int age = sc.nextInt();
            // or simply we can use "int year = Integer.parseInt(sc.nextLine());"
            System.out.println("Enter your name : ");
            String name = sc.nextLine();
            System.out.println("year : "+year+", age : "+age+", name : "+name);
            //System.out.println("Your name is : "+ name+ " and your age is "+(2022-year));
        }else {
            System.out.println("Entered input is not valid");
        }

        sc.close();
    }
}