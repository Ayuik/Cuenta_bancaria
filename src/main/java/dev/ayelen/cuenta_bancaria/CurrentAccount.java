package dev.ayelen.cuenta_bancaria;

public class CurrentAccount extends BankAccount {
    private float overdraft;

    public CurrentAccount(float balance, float annualinterest) {
        super(balance, annualinterest);
        this.overdraft = 0F;
    }

    public float getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(float overdraft) {
        this.overdraft = overdraft;
    }

    public void makeWithdrawal(float withdrawal_money) {
        if (withdrawal_money <= getBalance()) {
            super.makeWithdrawal(withdrawal_money);
        } else {
            float overdraft = withdrawal_money - getBalance();
            setOverdraft(overdraft);
            setBalance(0F);
            int updatedWithdrawals = getWithdrawals() + 1;
            setWithdrawals(updatedWithdrawals);
        }
    }

}
