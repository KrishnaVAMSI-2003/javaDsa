package Backtracking;

public class Maze2 {
    static void printAllPaths(boolean[][] maze, int row, int col, String path) {
        if(!maze[row][col]) return;
        if(row==maze.length-1 && col==maze[0].length-1){
            System.out.println(path);
            return;
        }
        maze[row][col] = false;
        if(row<maze.length-1) printAllPaths(maze, row+1,col, path+"D");
        if(col<maze[0].length-1) printAllPaths(maze, row, col+1,path+"R");
        if(row>0) printAllPaths(maze, row-1, col,path+"U");
        if(col>0) printAllPaths(maze, row, col-1,path+"L");
        maze[row][col] = true;
    }
    public static void main(String[] args) {
        System.out.println("Maze2");
        boolean[][] maze = {
                {true, false, false, false},
                {true, true, false, true},
                {false, true, false, false},
                {true, true, true, true},
        };
        printAllPaths(maze, 0, 0, "");
    }
}
