package Basics;
import java.util.Scanner;
public class inputSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Sum of "+num1+" and "+num2+" is: "+(num1+num2));
    }
}
