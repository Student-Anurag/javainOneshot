package Conditionals;
import java.util.Scanner;
public class dayNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter day no: ");
        char ch = sc.next().charAt(0);
        switch(ch){
            case '1' :
                System.out.println("Monday");
                break;
            case '2' :
                System.out.println("Tuesday");
                break;
            case '3' :
                System.out.println("Wednesday");
                break;
            case '4' :
                System.out.println("Thursday");
                break;
            case '5' :
                System.out.println("Friday");
                break;
            case '6' :
                System.out.println("Saturday");
                break;
            case '7' :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error! Invalid operator");
        }
    }
}
