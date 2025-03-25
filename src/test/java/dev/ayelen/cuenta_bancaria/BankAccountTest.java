package dev.ayelen.cuenta_bancaria;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    BankAccount myBankAccount;

    @BeforeEach
    void setUp(){
        myBankAccount = new BankAccount(1000F, 12F);
    }

    @Test
    @DisplayName("Should create a bank account with values for balance and annualinterest")
    void testBankAccout() {
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

    @Test
    @DisplayName("Should receive money and update balance")
    void testMakeDeposit(){
        float deposit_money = 4000F;
        float current_balance = myBankAccount.getBalance();
        int current_deposits = myBankAccount.getDeposits();
        myBankAccount.makeDeposit(current_deposits, deposit_money, current_balance);
         assertThat(myBankAccount.getBalance(), is(5000F));
        assertThat(myBankAccount.getDeposits(), is (1))
    }
}
