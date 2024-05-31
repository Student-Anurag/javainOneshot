package Recursion;
import java.util.Scanner;
public class binaryStrings {
    public static void printStrings(int n,String s){
        if(s.length()==n){
            System.out.println(s);
            return;
        }
        if(s.length()==0 || s.charAt(s.length()-1)=='0'){
            printStrings(n,s+1);
            printStrings(n,s+0);
        }
        else printStrings(n,s+0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printStrings(n,"");
    }
}
