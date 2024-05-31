package strings;
import java.util.Scanner;
public class updateEvenPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        // Creating an empty string to update all the even pos
        String tmp = "";
        for(int i=0;i<str.length();i++){
            if(i % 2 == 0){
                tmp += 'a';
            }
            else{
                tmp += str.charAt(i);
            }
        }
        str = tmp;
        System.out.println(str);
    }
}
