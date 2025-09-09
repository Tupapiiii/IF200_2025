/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author alvin
 */
public class SavingAccount extends Account{
    
    // Atributes
    private String initialDate;
    private int months;
    private float interest;
    
    // Constructor

    public SavingAccount(String initialDate, int months, float interest) {
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    public SavingAccount(String initialDate, int months, float interest, String accountNumber, double balance, Person client) {
        super(accountNumber, balance, client);
        this.initialDate = initialDate;
        this.months = months;
        this.interest = interest;
    }

    public String getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(String initialDate) {
        this.initialDate = initialDate;
    }

    public int getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
    
    

    @Override
    public void deposit(double amount) {
        super.setBalance(this.getBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if(amount <= this.getBalance()){
        super.setBalance(this.getBalance() - amount);
        }else{
            System.out.println("You don't have enough money");
        }
    }

    @Override
    public double interestCalculation() {
       double total;
       total = this.getMonths()
               * super.getBalance()
               * this.getInterest();
       return super.getBalance() + total;
    }//end method

    @Override
    public String toString() {
        String result = "\nAccount type: Saving Account"
                + "\n--------------------------------"
                + "\nInitial date of account: " + this.getInitialDate()
                + "\nMonths of saving: " + this.getMonths()
                + "\nInterest: " + this.getInterest()
                + "\nGained Interest: " + ((this.getMonths()
                                           * super.getBalance()/ 100)
                                            + this.getInterest()
                                         )
                +"\nBalance after interest: " + this.getBalance()
                                              + ((this.getMonths()
                                            * super.getBalance()/ 100)
                                            + this.getInterest()
                                         );
        
        return super.toString() + result;
                                        
    }//end tostring
    
    
    
}//end class
