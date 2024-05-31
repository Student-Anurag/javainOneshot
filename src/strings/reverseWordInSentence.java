package strings;
import java.util.Scanner;
public class reverseWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int i=0,j=0;
        while(j<sb.length()){
            if(sb.charAt(j) != ' '){
                j++;
            }
            else{
                reverse(sb,i,j-1);
                i = j+1;
                j = i;
            }
        }
        reverse(sb,i,j-1);  // for the last word
        System.out.println(sb);
    }
    public static void reverse(StringBuilder sb, int i, int j){
        while(i<=j){
            char tmp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,tmp);
            i++;
            j--;
        }
    }
}
