package strings;
import java.util.Scanner;
public class stringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        // taking input from the user
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        // System.out.println(sb.reverse()); --> reverse the whole string
        sb.setCharAt(1,'p');   // --> set the specific character to the specified index
        System.out.println(sb);
    }
}
