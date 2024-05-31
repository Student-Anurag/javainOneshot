package Recursion;
import java.util.Scanner;
public class mazePath {
    public static int Maze(int row,int col,int m,int n){
        if(row==m || col==n)    return 1;
        int rightWays = Maze(row,col+1,m,n);
        int downWays = Maze(row+1,col,m,n);
        return rightWays + downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M: ");
        int M = sc.nextInt();
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        System.out.print(Maze(1,1,M,N));
    }
}
