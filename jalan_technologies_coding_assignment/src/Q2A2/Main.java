package Q2A2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome, to the Zoo ticket counter!\n");
        System.out.println("enter 1 - to issue the new ticket\nenter 2 - to validate issued ticket\nenter any other key to exit/shutdown");
        while(true) {
            int inp = sc.nextInt();
            if(inp == 1) {
                System.out.print("Number of guests: ");
                int noOfGuests = sc.nextInt();
                int[] ages = new int[noOfGuests];
                System.out.println("Enter ages seperated by space: ");
                for(int i=0;i<noOfGuests;i++) {
                    //System.out.println("Enter age of person "+i+": ");
                    ages[i] = sc.nextInt();
                }
                NewTicket ticket = new NewTicket(ages);
                System.out.println("\nTicket successfully issued for "+noOfGuests+" persons with ages "+Arrays.toString(ages));
                System.out.println("Ticket Id: "+ticket.getId());
                System.out.println("Total charges are Rs."+ticket.totalCharges());
                System.out.println("Welcome to the zoo, everyone! We have a variety of exhibits and activities to enjoy, so take your time and explore.");
            } else if (inp == 2) {
                System.out.println("Enter ticket id to validate: ");
                int ticketId = sc.nextInt();
                Tickets.validate(ticketId);
            } else {
                break;
            }
            System.out.println("\nTotal no of tickets issued: "+Tickets.totalTickets);
            System.out.println("\nEnter 1.New ticket, 2.Validate ticket, any other to exit");
        }
    }
}

//this class is used as a database for tickets
class Tickets {
    public static int totalTickets;
    public static HashMap<Integer, NewTicket> tickets = new HashMap<>();
    public static void validate(int id) {
        if(tickets.containsKey(id)) {
            System.out.println("Ticket successfully found in the database, with the following details");
            tickets.get(id).printDetails();
        } else {
            System.out.println("There is no ticket with the given id in the database");
        }
    }

}


class NewTicket extends Tickets{
    private final int[] ages;
    private final int id;
    public NewTicket(int[] ages) {
        this.ages = Arrays.copyOf(ages, ages.length);
        this.id = 1000+tickets.size()+1;
        tickets.put(id, this);
        totalTickets++;
    }
    public int getId() {
        return this.id;
    }
    public int totalCharges() {
        int price = 0;
        for(int age : ages) {
            if(age<=2) continue;
            if(age<18) price += 100;
            else if(age<60) price += 500;
            else price+=300;
        }
        return price;
    }

    public void printDetails() {
        for (int i=0;i<ages.length;i++) {
            System.out.println("Guest "+(i+1)+" (age: "+ages[i]+")");
        }
    }
}