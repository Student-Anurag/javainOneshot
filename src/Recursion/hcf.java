package Recursion;
import java.util.Scanner;
public class hcf {
    public static int printHCF(int a,int b){
        if(b%a==0)  return a;
        return printHCF(b%a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println(printHCF(num1,num2));
    }
}
