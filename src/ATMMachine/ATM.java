package ATMMachine;
import java.util.*;
public class ATM {
    private User currentUser;
    private Scanner scanner;

    // Constructor
    public ATM(User user) {
        this.currentUser = user;
        this.scanner = new Scanner(System.in);
    }

    // Display ATM menu
    public void displayMenu() {
        int option;
        do {
            System.out.println("Welcome, " + currentUser.getName() + "!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (option != 4);
    }

    // Check balance
    private void checkBalance() {
        System.out.println("Your balance is: $" + currentUser.getAccount().getBalance());
    }

    // Deposit method
    private void deposit() {
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        currentUser.getAccount().deposit(amount);
    }

    // Withdraw method
    private void withdraw() {
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        currentUser.getAccount().withdraw(amount);
    }
}
