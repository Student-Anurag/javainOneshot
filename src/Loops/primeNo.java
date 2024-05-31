package Loops;
import java.util.Scanner;
public class primeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a no: ");
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i < n; i++) {
            if(n%i == 0) {
                System.out.printf("Composite no...");
                flag = false;
                break;
            }
        }
        if(flag == true){
            System.out.printf("Prime no...");
        }
    }
}
