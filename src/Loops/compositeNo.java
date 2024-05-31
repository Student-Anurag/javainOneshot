package Loops;
import java.util.Scanner;
public class compositeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a no: ");
        int n = sc.nextInt();
        for (int i = 2; i < n; i++) {
            if (n % i == 0) System.out.println("Composite no..");
            break;
        }
    }
}

