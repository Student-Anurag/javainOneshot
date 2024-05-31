package Conditionals;
import java.util.Scanner;
public class isTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        int s1 = sc.nextInt();
        System.out.print("Enter side2: ");
        int s2 = sc.nextInt();
        System.out.print("Enter side3: ");
        int s3 = sc.nextInt();
        System.out.println(((s1+s2)>s3) && ((s2+s3)>s1) && ((s3+s1)>s2) ? "Valid Triangle" : "Invalid Triangle");
    }
}
