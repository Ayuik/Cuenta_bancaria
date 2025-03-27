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

    public void makeDeposit (float deposit_money){
        float updatedBalance = deposit_money + getBalance();
        setBalance(updatedBalance);
        int updatedDeposits = getDeposits() + 1;
        setDeposits(updatedDeposits);
    }

    public void makeWithdrawal (float withdrawal_money){
        float updatedBalance = getBalance() - withdrawal_money;
        setBalance(updatedBalance);
        int updatedWithdrawals = getWithdrawals() + 1;
        setDeposits(updatedWithdrawals);
    }

    public float chargeMonthlyfee(){
        float updatedBalance = getBalance() - getMonthlyfee();
        setBalance(updatedBalance);
        return updatedBalance;
    }

    public void generateAccountStatement(){
       float balanceAfterFee = chargeMonthlyfee();
        float monthlyinterest = balanceAfterFee * (getAnnualinterest() / 12F / 100F);
        float updatedBalance = balanceAfterFee + monthlyinterest;
        setBalance(updatedBalance);
    }

    public String print(){
        String values = "Saldo: " + getBalance() + 
        "\r\n Número de consignaciones: " + getDeposits() + 
        "\\r\\n Número de retiros: " + getWithdrawals() + 
        "\\r\\n Tasa anual: " + getAnnualinterest() +
        "\r\n Comisión mensual: " + getMonthlyfee();
        return values;
    }
    
    
}
