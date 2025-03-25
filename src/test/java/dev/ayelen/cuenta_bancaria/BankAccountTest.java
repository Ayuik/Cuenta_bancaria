package dev.ayelen.cuenta_bancaria;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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
        assertThat(deposits, is(0));
        assertThat(withdrawals, is(0));
        assertThat(monthlyfee, is(0));
        assertThat(balance.getbalance(), is(1000F));
        assertThat(annualinterest.getAnnualinterest(), is (12F));  
    }
    
}
