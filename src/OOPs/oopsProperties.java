package OOPs;
class Account{
    // data integrity
    private double balance;
    public double getBalance(double balance){
        // perform authentication
        boolean res = validate("Anurag","Anu2005");
        // withdrawing the money
        if(res){
            this.balance = this.balance - balance;
        }else{
            System.out.println("Invalid username or password! Try Again!!!");
        }
        return balance;
    }
    public void setBalance(double balance){
        // perform authentication
        boolean res = validate("Anurag","Anu2005");
        // depositing the money
        if(res){
            this.balance = this.balance + balance;
            System.out.println(balance+" credited to your account");
        }else {
            System.out.println("Invalid Username or Password! Try Again!!!");
        }
    }
    private boolean validate(String Username,String Password){
        return Username.equalsIgnoreCase("Anurag") && Password.equals("Anu2005");
    }
}
public class oopsProperties {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setBalance(500.0);
        double balance = acc.getBalance(100.0);
        System.out.println(balance+ " withdrawn from your account");
    }
}
