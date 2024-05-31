package Conditionals;
import java.util.Scanner;
import static java.lang.Math.abs;
public class absoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<0) System.out.println(abs(n));
        else System.out.println(n);
    }
}
