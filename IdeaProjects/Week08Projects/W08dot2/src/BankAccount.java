/**
 * the BankAccount class
 * This is a class to create a BankAccount object with or without parameters
 * Contains variables for account number and balance as well as setters and getters for them
 * Contains methods makeDeposit() and makeWithdrawal()
 * @author Cayla Tribett
 */
public class BankAccount {

    private int accountNumber;
    private double balance;

    /**
     * the BankAccount constructor
     * creates an instance of BankAccount object without parameters
     */
    public BankAccount (){
        accountNumber = 0;
        balance = 0;
    }

    /**
     * the BankAccount constructor
     * creates an instance of BankAccount object with parameters
     * @param accountNumber
     * @param balance
     */
    public BankAccount (int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    /**
     * the getAccountNumber method
     * get the account number of the BankAccount object
     * @return accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * the setAccountNumber method
     * set the account number of the BankAccount object
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     *the getBalance method
     * get the balance of the BankAccount object
     * @return balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * the setBalance method
     * set the account number of the BankAccount object
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * the makeDeposit method
     * takes a deposit amount and adds it to the balance of the BankAccount instance
     * @param deposit
     */
    public void makeDeposit( double deposit){
        balance += deposit;
    }

    /***
     * the makeWithdrawal method
     * takes a withdrawal amount and subtracts it from the balance of the BankAccount instance
     * @param withdrawal
     */
    public void makeWithdrawal( double withdrawal){
        balance -= withdrawal;
    }
}
