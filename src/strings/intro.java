package strings;
import java.util.*;
public class intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter your name: ");
        str = sc.nextLine();
        System.out.print("Hello ");
        System.out.println(str);
    }                               //  sc.next() --->  if space occurs it will not take input after space
}
