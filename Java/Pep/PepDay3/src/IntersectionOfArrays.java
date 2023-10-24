// Guvvala Krishna vamsi, Reg No: 12008526

import java.util.Arrays;
import java.util.Scanner;
public class IntersectionOfArrays {
    public static void intersectionOfArrays() {
        Scanner sc = new Scanner(System.in);
        String list1 = sc.nextLine();
        String[] array1 = list1.split(",");
        String list2 = sc.nextLine();
        String[] array2 = list2.split(",");
        String list3 = sc.nextLine();
        String[] array3 = list3.split(",");
        modifyArray(array1);
        modifyArray(array2);
        modifyArray(array3);
        String passed="";
        for(int i=0;i<array1.length;i++) {
            for(int j=0;j<array2.length;j++) {
                if(array2[j].equals(array1[i])) {
                    for(int k=0;k<array3.length;k++) {
                        if(array3[k].equals(array1[i])) {
                            passed = passed+"'"+array1[i]+"'"+",";
                        }
                    }
                }
            }
        }
        String[] passedStudents = passed.split(",");
        System.out.println(Arrays.toString(passedStudents));
    }
    public static void modifyArray(String[] array) {
        array[0] = array[0].replace("[","");
        array[array.length-1] = array[array.length-1].replace("]","");
        for(int i=0;i<array.length;i++) {
            array[i] = array[i].replace("'","");
            array[i] = array[i].replace(" ","");
            array[i] = array[i].toLowerCase();
        }
    }
}
// Guvvala Krishna Vamsi, Reg no : 12008526