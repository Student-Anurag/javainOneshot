package Conditionals;
import java.util.Scanner;
public class divisility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num%3==0 || num%5==0) System.out.println(num+" is divisible by 5 or 3");
        else System.out.println(num+" is not divisible by 5 or 3");
    }
}
