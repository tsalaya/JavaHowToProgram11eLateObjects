public class Account {
    private String name;
    private double balance;

    public Account(String _name, double balance) {
        this.name = _name;
        if (balance > 0)
            this.balance = balance;
    }

    public Account() {

    }

    public void deposit(double amount) {
        if (amount > 0)
            this.balance += amount;
    }

    public void setName(String _name) {
        this.name = _name;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return balance;
    }
}