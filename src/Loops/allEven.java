package Loops;
import java.util.Scanner;
public class allEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter value of n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=1) System.out.printf(i+" ");
        }
    }
}
