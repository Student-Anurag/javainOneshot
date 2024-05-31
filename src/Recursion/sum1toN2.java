package Recursion;
import java.util.Scanner;
public class sum1toN2 {
    public static int Sum(int n){
        if(n==0){
            return 0;
        }
        return n + Sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(Sum(n));
    }
}
