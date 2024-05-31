package Patterns;
import java.util.Scanner;
public class practiceQues4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n-1;
        int nst = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){
                System.out.print(" "+" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print((char)(j+64)+" ");
            }
            nsp--;
            nst+=2;
            for(int j=i-1;j>=1;j--){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
