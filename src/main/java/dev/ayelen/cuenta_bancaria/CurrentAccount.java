package dev.ayelen.cuenta_bancaria;

public class CurrentAccount extends BankAccount{
    private float overdraft;

    public CurrentAccount(float balance, float annualinterest) {
        super(balance, annualinterest);
        this.overdraft = 0F;
    }

    public float getOverdraft() {
        return overdraft;
    }

    
}
