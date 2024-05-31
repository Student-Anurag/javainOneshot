package Basics;
import java.util.Scanner;
public class characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        System.out.println(ch);
        System.out.println((int)ch);
    }



}
