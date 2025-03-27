package dev.ayelen.cuenta_bancaria;

public class SavingsAccount extends BankAccount {
    boolean isActive;

    public SavingsAccount(float balance, float annualinterest) {
        super(balance, annualinterest);
        this.isActive = true;
    }

    public boolean getIsActive(){
        return isActive;
    }

    public boolean setIsActive(){
        if(getBalance() < 10000F){
            return this.isActive = false;
        } 
        return this.isActive = true;
    }

    public void makeDeposit(float deposit_money){
        if(isActive){
            super.makeDeposit(deposit_money);
        }
    }   

    public void makeWithdrawal(float withdrawal_money){
        if(isActive){
            super.makeWithdrawal(withdrawal_money);
        }
    }

}