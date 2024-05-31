package Recursion;
import java.util.Scanner;
public class stairPath {
    public static int Path(int n){
        if(n==1 || n==2)  return n;
        return Path(n-1)+Path(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("No of ways: "+Path(n));
    }
}
