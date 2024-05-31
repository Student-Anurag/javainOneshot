package Recursion;
import java.util.Scanner;
public class dectobin {
    public static int convert(int n){
        if(n==0)  return 0;
        int ans = (n%2) + 10 * convert(n/2);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(convert(n));
    }
}
