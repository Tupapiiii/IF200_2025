
package logic;

/**
 *
 * @author alvin
 */
public class Bank {//simulacion de sinpe
    private String name;

    public Bank(String name) {
        this.name = name;
    }
    
    public void transfer(Account from, Account to, double amount) {
        if (from.getBalance() >= amount) {
            from.withdraw(amount);
            to.deposit(amount);
            System.out.println("Transfer successful from " + from.getNumber() + " to " + to.getNumber());
        } else {
            System.out.println("Transfer failed. Not enough balance.");
        }
    }

    @Override
    public String toString() {
        return "\nBank"
                + "\n--------------------"
                + "\nName: " + name;
    }
    
    
    
}
