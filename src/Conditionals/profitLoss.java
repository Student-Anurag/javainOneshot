package Conditionals;
import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        double cp = sc.nextDouble();
        System.out.print("Enter sell price: ");
        double sp = sc.nextDouble();
        double profit_amount = sp-cp;
        double loss_amount = cp-sp;
        if(sp>cp) System.out.println("Profit is: "+profit_amount);
        else if(cp>sp) System.out.println("Loss is: "+loss_amount);
        else System.out.println("No Profit No Loss");
    }
}
