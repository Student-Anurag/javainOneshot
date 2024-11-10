package ATMMachine;

public class main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("04122211190",12000.90);
        User user = new User("Saptirshi",account);
        ATM atm = new ATM(user);
        atm.displayMenu();
    }
}
