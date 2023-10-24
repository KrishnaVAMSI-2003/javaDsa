import java.util.*;

public class Collection {


// Interface is used to represent behaviour.

    // The Collection interface
    // It is the base interface for List/Queue/Set.
    // this interface provides common functionalities for manipulating data.
    // Collection interface is the foundation of all other iterface.

    //The List Interface
    // List Interface is derived from Collection Interface.
    // List Interface contains/provides Ordered data.
    // List Interface allows duplicates.

    public static void collection() {

    }

    public static void arrayList() {
        // ArrayList
        // It is dynamic Data structucture : grow and shrink the size of the data structure.
        // Data structure can be categorised into 2 categories

        // 1.1 Non-Generic Data Structure: Loosely typed
        // Non-generic data structure allows mixed datatypes in the collection.

        ArrayList grocery = new ArrayList();
        grocery.add("milk");
        grocery.add(10);
        grocery.add(1.24);
        grocery.add(true);

        // 1.2 Generic Data Structure : Strongly typed.
        // generic data structure do not allow mixed datatype.
        // they only allow the specified type of data to be added in the collection.

        ArrayList<Integer> grocery1 = new ArrayList<Integer>();
        grocery1.add(10);
        grocery1.add(20);

        // grocery1.add("thirty");  //we cannot add this because it is of string datatype

        // Advantages of generic data structure is there is not typecasting in such collectio
        // which adds to performance enhancement of application.

        // Typecasting slows down apps or affects performance of application.
    }

    // Simulating shopping cart using ArrayList.
    public static void shoppingCart() {
        ArrayList<String> shopping_cart = new ArrayList<String>();
        System.out.println(shopping_cart.size());
        shopping_cart.add("iPhone");
        shopping_cart.add("Macbook");
        shopping_cart.add("charger");
        System.out.println(shopping_cart.size());
    }

    public static void linkedList() {
        // Linked List implementation.

        //Linked List implaments collection interface.
        // liked list uses doubly linked list intrnally to store the data.
        //it allows duplicate elements.
        // it is an ordered collection.

        // Linked has a faster performance when manipulating elements.


        // using Linked List to simulate employees.

        LinkedList<String> metaEmployees = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        for(int i=1;i<=5;i++) {
            System.out.println("Registering employee no 000"+i);
            String newEmployee = sc.next();
            metaEmployees.add(newEmployee);
        }

        // We will use iterator to access elements
        // Iterator is like a pointer that help us fetching elements.

        Iterator<String> pointer = metaEmployees.iterator();

        while(pointer.hasNext()) {
            System.out.println(pointer.next());
        }
    }


    // write a java program that accepts the name of scientists (store in array list)and print the name in the below order
    // Dear Mr. <LastName>.<FirstnameFirstChar>
    public static void activity1() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<String>();
        name.add(sc.nextLine());
        String[] arr = name.get(0).split(" ");
        String newName = arr[arr.length-1]+arr[0].charAt(1);
        System.out.println("Dear Mr. "+newName);
    }
}
