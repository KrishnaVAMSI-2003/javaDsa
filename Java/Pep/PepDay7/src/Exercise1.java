// Guvvala Krishna Vamsi, Reg no:12008526
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> arrayList = new ArrayList<Double>();
        for(int i=0;i<20;i++) {
            double inp = sc.nextDouble();
            if(inp==-1)
                break;
            arrayList.add(inp);
        }
        double avg = average(arrayList);
        DecimalFormat dc = new DecimalFormat("###.00");
        String x=dc.format(avg);
        System.out.println(x);
    }
    public static double average(ArrayList<Double> arr) {
        double sum = 0;
        for(int i=0;i<arr.size();i++) {
            sum+=arr.get(i);
        }
        return sum/arr.size();
    }
}
