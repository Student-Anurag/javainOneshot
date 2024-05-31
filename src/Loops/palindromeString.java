package Loops;
import java.util.Scanner;
public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a string: ");
        String str = sc.nextLine();
        int n = str.length();
        String rev = "";
        for(int i=n-1;i>=0;i--){
            rev += str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
