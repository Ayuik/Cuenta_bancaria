package dev.ayelen.cuenta_bancaria;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    @DisplayName("Should create a bank account with values for balance and annualinterest")
    void testBankAccout() {
        BankAccount myBankAccount = new BankAccount(1000F, 12F);
        int deposits = myBankAccount.getDeposits();
        int withdrawals = myBankAccount.getWithdrawals();
        float monthlyfee = myBankAccount.getMonthlyfee();
        float balance = myBankAccount.getBalance();
        float annualinterest = myBankAccount.getAnnualinterest();
        assertThat(deposits, is(0));
        assertThat(withdrawals, is(0));
        assertThat(monthlyfee, is(0F));
        assertThat(balance, is(1000F));
        assertThat(annualinterest, is (12F));  
    }

    @Test
    @DisplayName("Should set new values for the attibutes")
    void testSet(){
        BankAccount myBankAccount = new BankAccount(1000F, 12F);
        float updatedBalance = 8000F;
        myBankAccount.setBalance(updatedBalance);
        int deposits = 2;
        myBankAccount.setDeposits(deposits);
        float monthlyfee = 1000F;
        myBankAccount.setMonthlyfee(monthlyfee);
        int withdrawals = 5;
        myBankAccount.setWithdrawals(withdrawals);

        assertThat(myBankAccount.getBalance(), is(8000F));
        assertThat(myBankAccount.getDeposits(), is (2));
        assertThat(myBankAccount.getWithdrawals(), is (5));
        assertThat(myBankAccount.getMonthlyfee(), is(1000F));
    }
    
}
