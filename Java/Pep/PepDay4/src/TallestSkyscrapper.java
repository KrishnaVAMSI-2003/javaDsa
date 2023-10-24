// Guvvala Krishna Vamsi,  Reg no: 12008526

import java.util.Scanner;
public class TallestSkyscrapper {
    public static void tallestSkyScrapper() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] floorsArray = input.split("],");
        String[] buildingsArray = floorsArray[0].split(",");

        String[][] floors = new String[floorsArray.length][buildingsArray.length];
        for(int i=0;i<floorsArray.length;i++) {
            floors[i]=floorsArray[i].split(",");
        }
        for(int i=0;i<floorsArray.length;i++) {
            for(int j=0;j< buildingsArray.length;j++) {
                floors[i][j] = floors[i][j].replace("[","");
                floors[i][j] = floors[i][j].replace("]","");
                floors[i][j] = floors[i][j].replace(" ","");
            }
        }
        int[][] values =new int[floorsArray.length][buildingsArray.length];
        int[] height = new int[buildingsArray.length];
        for(int i=0;i<floorsArray.length;i++) {
            for(int j=0;j< buildingsArray.length;j++) {
                values[i][j] = Integer.parseInt(floors[i][j]);
            }
        }
        for(int i=0;i<buildingsArray.length;i++) {
            for(int j=0;j<floorsArray.length;j++) {
                height[i]+=values[j][i];
            }
        }
        int tallest = height[0];
        for(int i=0;i<height.length;i++) {
            if(tallest<height[i]) {
                tallest=height[i];
            }
        }
        System.out.println("Height of tallest building = "+tallest);
    }
}

