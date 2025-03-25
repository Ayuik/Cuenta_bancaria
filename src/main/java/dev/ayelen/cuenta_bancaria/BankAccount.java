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

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setDeposits(int deposits) {
        this.deposits = deposits;
    }

    public void setWithdrawals(int withdrawals) {
        this.withdrawals = withdrawals;
    }

    public void setMonthlyfee(float monthlyfee) {
        this.monthlyfee = monthlyfee;
    }

    public void makeDeposit (int current_deposits, float deposit_money, float current_balance){
        float updatedBalance = deposit_money + current_balance;
        setBalance(updatedBalance);
        int updatedDeposits = current_deposits + 1;
        setDeposits(updatedDeposits);
    }

    public void chargeMonthlyfee(){
        float updatedBalance = getBalance() - getMonthlyfee();
        setBalance(updatedBalance);
    }

    
    
}
