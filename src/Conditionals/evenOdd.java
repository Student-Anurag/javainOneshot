package Conditionals;
import java.util.Scanner;
public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n%2==0) System.out.println("Even Number");
        else System.out.println("Odd Number");
    }

}
