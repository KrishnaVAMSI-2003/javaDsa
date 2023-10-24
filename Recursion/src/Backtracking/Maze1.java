package Backtracking;

public class Maze1 {
    static int count(int row, int col){
        if(row ==1 || col==1){
            return 1;
        }
        int c = 0;
        c += count(row-1,col);
        c += count(row,col-1);
        return c;
    }
    static void path(int row, int col, String path) {
        if(row==1 || col==1){
            while (col>1){
                path+="R";
                col--;
            }
            while (row>1){
                path+="D";
                row--;
            }
            System.out.println(path);
            return;
        }
        path(row-1,col,path+"D");
        path(row,col-1,path+"R");
    }
    public static void main(String[] args) {
        path(3,3,"");
    }
}
