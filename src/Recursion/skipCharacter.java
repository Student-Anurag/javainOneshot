package Recursion;
import java.util.Scanner;
public class skipCharacter {
    public static void Skip(String s,int i,String ans){
        if(i==s.length()){
            System.out.print(ans);
            return;
        }
        if(s.charAt(i)!='a')  ans+=s.charAt(i);
        Skip(s,i+1,ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        Skip(s,0,"");
    }
}
