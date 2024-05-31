package strings;
import  java.util.Scanner;
public class palindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        int i=0,j=str.length()-1;
        boolean flag = true;
        while(i<=j){
            if(str.charAt(i) != str.charAt(j)){
                flag = false;
            }
            i++;
            j--;
        }
        if(flag){
            System.out.println("Palindrome string");
        }
        else{
            System.out.println("Not a Palindrome string");
        }
    }
}
