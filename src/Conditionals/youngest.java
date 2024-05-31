package Conditionals;
import java.util.Scanner;
public class youngest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of Ram: ");
        int age1 = sc.nextInt();
        System.out.print("Enter age of Shyam: ");
        int age2 = sc.nextInt();
        System.out.print("Enter age of Ajay: ");
        int age3 = sc.nextInt();
        if(age1<age2){
            if(age1<age3) System.out.println("Ram is youngest");
            else System.out.println("Ajay is youngest");
        }
        else if(age2<age1){
            if(age2<age3) System.out.println("Shyam is youngest");
            else System.out.println("Ajay is youngest");
        }
    }
}
