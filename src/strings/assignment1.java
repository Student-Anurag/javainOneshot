package strings;
import java.util.Scanner;
public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        StringBuilder sb = new StringBuilder(sc.nextLine());
        for(int i=0;i<sb.length();i++){
            if(i%2==1){
                sb.setCharAt(i,'#');
            }else{
                sb.charAt(i);
            }
        }
        System.out.println(sb);
    }
}
