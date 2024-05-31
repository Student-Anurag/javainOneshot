package Recursion;
import java.util.Scanner;
public class sum1toN {
    public static void Sum(int n, int s){
        if(n==0){
            System.out.println(s);
            return;
        }
        Sum(n-1,n+s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int s = 0;
        Sum(n,s);
    }
}
