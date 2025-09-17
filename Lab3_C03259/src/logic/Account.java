
package logic;

/**
 *
 * @author alvin
 */
public abstract class Account {
    private String number;
    private double balance;
    private Client client;

    public Account() {
    }

    public Account(String number, double balance, Client client) {
        this.number = number;
        this.balance = balance;
        this.client = client;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    //abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void calculateInterest();

    @Override
    public String toString() {
        String result = "\nBank Account Information: "
                + "\n------------------------------- " 
                + "\nAccount Number: " + this.getNumber()
                + "\nBalance: " + this.getBalance()
                + "\nAccount Owner: " + this.getClient().toString();
        return result;
    }
    
    
}
