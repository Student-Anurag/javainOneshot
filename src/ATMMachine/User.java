package ATMMachine;

public class User {
    private final String name;
    private final BankAccount account;

    // Constructor
    public User(String name, BankAccount account) {
        this.name = name;
        this.account = account;
    }

    // Getters
    public String getName() {
        return name;
    }

    public BankAccount getAccount() {
        return account;
    }
}
