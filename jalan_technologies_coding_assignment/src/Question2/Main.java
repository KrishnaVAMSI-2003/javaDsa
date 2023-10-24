package Question2;

import java.util.*;

public class Main {
    public static void main (String[] args) {
        TicketCounter my_counter = new TicketCounter(new int[]{12, 55, 34});
        System.out.println(my_counter.getTotalCharges(1));
        my_counter.displayAges(1);
    }
}

class Ticket {
    private int ticketId;
    private int[] ages;
    static int totalIssuedTickets = 0;

    Ticket(int[] arr) {
        this.ticketId = totalIssuedTickets + 1;
        totalIssuedTickets++;
        this.ages = arr;
    }

    public int getTicketId() {
        return this.ticketId;
    }

    public int[] getAges() {
        return this.ages;
    }

    public int getTotalTicketsIssued() {
        return totalIssuedTickets;
    }
}

class TicketCounter {
    List<Ticket> tickets = new ArrayList<>();;
    TicketCounter(int[] ages) {
        Ticket new_ticket = new Ticket(ages);
        tickets.add(new_ticket);
    }

    public int getTotalCharges(int ticket_id) {
        int[] guests = null;
        for (Ticket t : tickets) {
            if (t.getTicketId() == ticket_id) {
                guests = t.getAges();
                break;
            }
        }

        if (guests == null) {
            System.out.println("No ticket found");
            return 0;
        }

        int charge = 0;
        for (int age : guests) {
            if (age > 2 && age < 18) charge += 100;
            else if (age >= 18 && age < 60) charge += 500;
            else if (age >= 60) charge += 300;
        }
        return charge;
    }

    public void displayAges(int ticket_id) {
        int[] guests = null;
        for (Ticket t : tickets) {
            if (t.getTicketId() == ticket_id) {
                guests = t.getAges();
                break;
            }
        }

        if (guests == null) {
            System.out.println("No ticket found");
            return;
        }

        int i = 1;
        while (i <= guests.length) {
            System.out.println("Guest " + i + ":" + guests[i - 1]);
            i++;
        }
    }
}