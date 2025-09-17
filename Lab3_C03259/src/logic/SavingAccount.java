
package logic;

/**
 *
 * @author alvin
 */
public class SavingAccount extends Account{
    
    private String startDate;
    private int months;
    private double interestRate; //0.05 = 5%

    public SavingAccount(){
    }
    
    public SavingAccount(String number, double balance, Client client, String startDate, int months, double interestRate) {
        super(number, balance, client);
        this.startDate = startDate;
        this.months = months;
        this.interestRate = interestRate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    
     @Override
    public void deposit(double amount){
        setBalance(getBalance() + amount);
    }
    
     @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Not enough balance");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = months * 
               getBalance() * interestRate;
               setBalance(getBalance() + interest);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nAccount Type: Saving Account"
                + "\n--------------------------------"
                + "\nStart Date: " + getStartDate()
                + "\nMonths: " + getMonths()
                + "\nInterest Rate: " + getInterestRate();
    }
    
    
    
}
