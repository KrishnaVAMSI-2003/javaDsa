// Guvvala Krishna Vamsi, Reg no: 12008526
// Program to print out the elements in priority queue

import java.util.PriorityQueue;

public class ColorsPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<String> colors = new PriorityQueue<String>();
        colors.add("White");
        colors.add("Yellow");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Violet");
        colors.add("Black");
        for(String color : colors) {
            System.out.println(color);
        }
    }
}
