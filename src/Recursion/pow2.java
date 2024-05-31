package Recursion;
import java.util.Scanner;
public class pow2 {
    public static int power(int a, int b){
        if(b==0)  return 1;
        if(b % 2==0)    return power(a,b/2) * power(a,b/2);
        else return power(a,b/2) * power(a,b/2) * a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter power: ");
        int b = sc.nextInt();
        System.out.println(power(a,b));
    }
}
