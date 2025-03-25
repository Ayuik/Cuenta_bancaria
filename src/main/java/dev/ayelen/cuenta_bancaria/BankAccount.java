package dev.ayelen.cuenta_bancaria;

public class BankAccount {
    protected float balance;
    protected int deposits;
    protected int withdrawals;
    protected float monthlyfee;
    protected float annualinterest;

    public BankAccount(float balance, float annualinterest){
        this.balance = balance;
        this.deposits = 0;
        this.withdrawals = 0;
        this. annualinterest = annualinterest;
        this.monthlyfee = 0F;
    }

    public float getBalance() {
        return balance;
    }

    public int getDeposits() {
        return deposits;
    }

    public int getWithdrawals() {
        return withdrawals;
    }

    public float getMonthlyfee() {
        return monthlyfee;
    }

    public float getAnnualinterest() {
        return annualinterest;
    }

    
    
}
