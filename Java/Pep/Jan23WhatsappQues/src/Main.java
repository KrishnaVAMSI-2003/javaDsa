import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] marks = new int[]{80,79,95,69,88};
        Student std = new Student(marks);
        std.students();
    }
}
class Student {
    int[] arr;
    Student(int[] arr) {
        for (int count : this.arr = arr) {
        }
    }
    Scanner sc = new Scanner(System.in);
    void students() {
        ArrayList<String> studentArray = new ArrayList<String>();
        int n=0;
        while(n!=1) {
            System.out.println("1. Exit");
            System.out.println("2. To add Student");
            System.out.println("3. To display total marks");
            System.out.println("4. To display total no of students");
            System.out.println("5. To remove Students");
            System.out.println("6. To display highest marks");
            System.out.println("7. To display lowest marks");
            n = sc.nextInt();
            sc.nextLine();
            if(n==2) {
                addStudent(studentArray);
            } else if(n==3) {
                System.out.println(totalMarks(arr));
            } else if(n==4) {
                System.out.println(totalStudents(studentArray));
            } else if(n==5) {
                removeStudent(studentArray);
            } else if(n==6) {
                System.out.println(maxMarks());
            } else if(n==7) {
                System.out.println(minMarks());
            } else {
                System.out.println("Invalid");
            }

        }
    }
    int totalMarks(int[] arr) {

        int total = 0;
        for (int i=0;i<arr.length;i++) {
            total+=arr[i];
        }
        return total;
    }
    int totalStudents(ArrayList<String> stdArr) {
        return stdArr.size();
    }
    void addStudent(ArrayList<String> stdArr) {
        System.out.println("Enter name of the student to add : ");
        String name = sc.nextLine();
        stdArr.add(name);
        System.out.println("Successfully added");
    }
    void removeStudent(ArrayList<String> stdArr) {
        System.out.println("Enter name of the student to remove: ");
        String name = sc.nextLine();
        stdArr.remove(name);
        System.out.println("Successfully removed");
    }
    int maxMarks() {
        int max = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
    int minMarks() {
        int min = arr[0];
        for(int i=1;i<arr.length;i++) {
            if(arr[i]<min) {
                min = arr[i];
            }
        }
        return min;
    }
}