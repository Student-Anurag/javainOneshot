package Loops;
import java.util.Scanner;
public class countDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a no: ");
        int num = sc.nextInt();
        int count = 0;
        while(num!=0){
            int rem = num%10;
            count++;
            num/=10;
        }
        System.out.println("Count of digit: "+count);
    }
}
