package Conditionals;
import java.util.Scanner;
public class findCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a character: ");
        char ch = sc.next().charAt(0);
        if(ch == 'a') System.out.println("input character is "+ch);
        else System.out.println("input character is "+ch);
    }
}
