package Recursion;
import java.util.Scanner;
public class mazePath2 {
    public static int Maze2(int m,int n){
        if(m==1 || n==1)  return 1;
        int rightWays = Maze2(m,n-1);
        int downWays = Maze2(m-1,n);
        return rightWays + downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M: ");
        int M = sc.nextInt();
        System.out.print("Enter N: ");
        int N = sc.nextInt();
        System.out.print(Maze2(M,N));
    }
}
