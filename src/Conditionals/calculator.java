package Conditionals;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter operator: ");
        char op = sc.next().charAt(0);
        System.out.print("Enter num2: ");
        int n2 = sc.nextInt();
        switch(op){
            case '+' :
                System.out.println(n1+n2);
                break;
            case '-' :
                System.out.println(n1-n2);
                break;
            case '*' :
                System.out.println(n1*n2);
                break;
            case '/' :
                System.out.println(n1/n2);
                break;
            default :
                System.out.println("Invalid Operator");
        }
    }
}
