package Recursion;
import java.util.Scanner;
public class subsets {
    public static void printSubsets(String s,int i,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        printSubsets(s,i+1,ans);    // not taking the character
        printSubsets(s,i+1,ans+s.charAt(i));    // taking the character
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        printSubsets(s,0,"");
    }
}
