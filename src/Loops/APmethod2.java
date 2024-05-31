package Loops;
import java.util.Scanner;
public class APmethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter no of terms: ");
        int n = sc.nextInt();
        System.out.printf("Enter first term: ");
        int a = sc.nextInt();
        System.out.printf("Enter common difference: ");
        int d = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.printf(a+" ");
            a+=d;
        }
    }
}
