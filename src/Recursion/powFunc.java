package Recursion;
import java.util.Scanner;
public class powFunc {
    public static int power(int a, int b){
        if(b==0)  return 1;
        return a * power(a,b-1);
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
