package strings;
import java.util.Scanner;
public class convertIntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter a no: ");
        n = sc.nextInt();
        // converting integer to string
        String s = Integer.toString(n);
        System.out.println(s);
        System.out.println("Count of digit: "+s.length());
    }
}
