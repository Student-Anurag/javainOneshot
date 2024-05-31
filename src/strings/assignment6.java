package strings;
import java.util.Scanner;
public class assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        str= str.concat(reverse(str));
        System.out.println(str);
    }
    public static String reverse(String s){
        String tmp = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            tmp = ch+tmp;
        }
        return tmp;
    }
}
