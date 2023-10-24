//Write a Java program that ask user to enter 5 english words
// Prepare a map where the key: word, value=no of values in the word
//ex: {happy=5,joy=3,....}

//Write a Java Program that Ask user to enter 5 subject Marks
// Prepare a map where the key:Marks, value=pass if marks>45 else fail
//{54=pass, 33=fail,....}

// Write a function called showNumbers that takes a parameter limit.
//should produce a map of all numbers b/w 0 and limit with a label to identify the even
//and odd numbers. For example, if the limit is 3, it should produce a Map as follows:
// 0 EVEN
// 1 ODD
// 2 EVEN
// 3 ODD

import java.util.LinkedHashMap;
import java.util.Scanner;

//Write a Java Program that Ask user to enter sentence
// Prepare a map where the key:character, value=repetetion count of character
// for eg. 'crood' {c=1,r=1,o=2,d=1}
public class Exercise {
    public static void main(String[] args) {
        repCount();
    }



    public static void noOfLetters() {
        LinkedHashMap<String, Integer> inp = new LinkedHashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++) {
            String word = sc.next();
            int no = word.length();
            inp.put(word,no);
        }
        System.out.println(inp);
    }
    public static void marks() {
        LinkedHashMap<Integer,String> inp = new LinkedHashMap<Integer,String>();
        Scanner sc = new Scanner(System.in);
        String res;
        for(int i=0;i<5;i++) {
            int marks = sc.nextInt();
            if(marks>45) {
                res="pass";
            } else res="fail";
            inp.put(marks,res);
        }
        System.out.println(inp);
    }
    public static void numbers() {
        LinkedHashMap<Integer,String> inp = new LinkedHashMap<Integer,String>();
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String out;
        for(int i=0;i<=n;i++) {
            if(i%2==0) out="Even";
            else out="ODD";

            inp.put(i,out);
        }
        System.out.println(inp);
    }
    public static void repCount() {
        LinkedHashMap<Character,Integer> inp = new LinkedHashMap<Character,Integer>();
        Scanner sc = new Scanner(System.in);
        String input=sc.nextLine();
        char[] charArr = input.toCharArray();
        for(int i=0;i<charArr.length;i++) {
            char ele = charArr[i];
            int count=0;
            for(int j=0;j<charArr.length;j++){
                if(charArr[j]==ele) count++;
            }
            inp.put(ele,count);
        }
        System.out.println(inp);
    }
}


