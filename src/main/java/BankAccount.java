import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
         *  Checking Account.
         */
        CHECKINGS,
        /**
         * Savings Account.
         */
        SAVINGS,
        /**
         * Student Account.
         */
        STUDENT,
        /**
         * Workplace Account.
         */
        WORKPLACE
    }

    /**
     * Account number.
     */
    private int accountNumber;
    /**
     * Account type.
     */
    private BankAccountType accountType;
    /**
     * Account balance.
     */
    private double accountBalance;
    /**
     * Account owner name.
     */
    private String ownerName;
    /**
     * Interest rate.
     */
    private double interestRate;
    /**
     * Interest earned.
     */
    private double interestEarned;

    /**
     * Creates instance of BankAccount
     * @param name Name.
     * @param accountCategory Type of account.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        this.accountNumber = 0;
        this.accountBalance = 0;
        this.interestRate = 0;
        this.interestEarned = 0;
        Bank.addOneAccount();
    }

    /**
     *
     * @return Account Number.
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }

    /**
     * Sets account number
     * @param x account number.
     */
    public void setAccountNumber(final int x) {
        this.accountNumber = x;
    }

    /**
     *
     * @return Type of bank account.
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * Sets account type.
     * @param type type of account.
     */
    public void setAccountType(final BankAccountType type) {
        this.accountType = type;
    }

    /**
     *
     * @return returns account balance.
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets account balance.
     * @param money amount.
     */
    public void setAccountBalance(final double money) {
        this.accountBalance = money;
    }
    /**
     *
     * @return Returns owner name.
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * Sets owner name.
     * @param name Name to be set.
     */
    public void setOwnerName(final String name) {
        this.ownerName = name;
    }

    /**
     *
     * @return Returns interest rate.
     */
    public double getInterestRate() {
        return this.interestRate;
    }

    /**
     * Sets interest rate.
     * @param rate rate set.
     */
    public void setInterestRate(final double rate) {
        this.interestRate = rate;
    }

    /**
     *
     * @return Returns interest earned.
     */
    public double getInterestEarned() {
        return this.interestEarned;
    }

    /**
     * Sets Interest earned.
     * @param earned Interest earned.
     */
    public void setInterestEarned(final double earned) {
        this.interestEarned = earned;
    }
}