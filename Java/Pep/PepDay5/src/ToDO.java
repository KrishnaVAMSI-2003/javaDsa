// Guvvala Krishna Vamsi,   Reg no: 12008526

import java.util.ArrayList;
import java.util.Scanner;

public class ToDO {
    static Scanner sc = new Scanner(System.in);
    public static void toDo() {
        ArrayList<String> toDolist = new ArrayList<String>();
        while(true) {
            System.out.println("to Add todo enter 1");
            System.out.println("to list todo enter 2");
            System.out.println("to select todo enter 3");
            System.out.println("to delete todo enter 4");
            System.out.println("to replace todo enter 5");
            int n = sc.nextInt();
            sc.nextLine();
            if(n==1)
                add(toDolist);
            else if (n==2)
                list(toDolist);
            else if(n==3)
                select(toDolist);
            else if (n==4)
                remove(toDolist);
            else if(n==5)
                replace(toDolist);
        }
    }

    // Guvvala Krishna Vamsi,   Reg no: 12008526

    public static void add(ArrayList<String> todolist) {
        System.out.println("Enter toDo to add : ");
        todolist.add(sc.nextLine());
    }
    public static void list(ArrayList<String> todolist) {
        for(int i=1;i<=todolist.size();i++) {
            System.out.println(i+" "+todolist.get(i-1));
        }
    }
    public static void select(ArrayList<String> todolist) {
        System.out.println("Enter the position of todo to select and display : ");
        int n = sc.nextInt();
        sc.nextLine();
        String selectedTodo = todolist.get(n-1);
        System.out.println(selectedTodo);
    }

    // Guvvala Krishna Vamsi,   Reg no: 12008526

    public static void remove(ArrayList<String> todolist) {
        System.out.println("Enter the position of the todo to replace : ");
        int n = sc.nextInt();
        sc.nextLine();
        todolist.remove(todolist.get(n-1));
    }
    public static void replace(ArrayList<String> todolist) {
        System.out.println("Enter position of todo to replace : ");
        int n=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter toDo to replace");
        String newToDo = sc.nextLine();
        todolist.set(n-1,newToDo);
    }
}
