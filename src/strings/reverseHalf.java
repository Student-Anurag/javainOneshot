package strings;
import java.util.Scanner;
public class reverseHalf {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a string: ");
            StringBuilder sb = new StringBuilder(sc.nextLine());
            int i = 0, j = sb.length()/2 - 1;
            while(i<=j){
                char tmp = sb.charAt(i);
                sb.setCharAt(i,sb.charAt(j));
                sb.setCharAt(j,tmp);
                i++;
                j--;
            }
            System.out.println(sb);
        }
}
