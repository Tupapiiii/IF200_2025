
package logic;

/**
 *
 * @author alvin
 */
public class CheckingAccount extends Account{
    private double interestRate;

    public CheckingAccount(String number, double balance, Client client, double interestRate) {
        super(number, balance, client);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    
     @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Not enough balance.");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = (getBalance() * interestRate) / 12; // mensual
        setBalance(getBalance() + interest);
    }
    
     @Override
    public String toString() {
        return super.toString()
                + "\nAccount Type: Checking Account"
                + "\n--------------------------------"
                + "\nInterest Rate: " + getInterestRate();
    }
}
