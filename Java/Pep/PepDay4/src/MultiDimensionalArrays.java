import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void mutiDimensioalArrays() {
        int[][] testArr = {
                {10,20,30,40,50},
                {70,80,90},
                {100}
        };
        for(int i=0;i<testArr.length;i++) {
            for (int j=0;j<testArr[i].length;j++) {
                System.out.print(testArr[i][j]+" ");
            }
            System.out.println();
        }


//        int[][] test1 = {{1,2,3},{4,5,6},{7,8,9}};
//        int[][] test2 = {{2,2,2},{3,3,3},{4,4,4}};
//        int[][] res = new int[3][3];
//        for(int i=0;i<3;i++) {
//            for (int j=0;j<3;j++) {
//                res[i][j]=test1[i][j]*test2[i][j];
//                System.out.print(res[i][j]+" ");
//            }
//            System.out.println("");
//        }
    }
}
