package Recursion;
import java.util.Scanner;
public class kthIncreasingSequence {
    public static void printSubsets(int i,int k,int n,String ans){
        if(i==k || i==n){
            System.out.println(ans);
            return;
        }
        printSubsets(i+1,k,n,ans);    // not taking the character
        //printSubsets(i+1,k,n,ans+s.charAt(i));    // taking the character
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        printSubsets(0,k,n,"");
    }
}
