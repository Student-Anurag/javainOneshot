package Recursion;
import java.util.Scanner;
public class stairPath2 {
    public static int Path(int n){
        if(n==1)  return 1;
        if(n==2)  return 1;
        if(n==3)  return 2;
        return Path(n-1)+Path(n-3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("No of ways: "+Path(n));
    }
}
