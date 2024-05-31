package strings;
import java.util.*;
public class setToggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if((int)ch >= 97 && (int)ch <= 122){    // small case
                ch -= 32;
                sb.setCharAt(i,ch);
            }
            else if((int)ch >= 65 && (int)ch <= 90){    // capital case
                ch += 32;
                sb.setCharAt(i,ch);
            }
        }
        System.out.println(sb);
    }
}
