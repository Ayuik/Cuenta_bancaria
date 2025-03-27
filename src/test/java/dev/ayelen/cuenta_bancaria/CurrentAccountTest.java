package dev.ayelen.cuenta_bancaria;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CurrentAccountTest {
    CurrentAccount currentAccount;

    @BeforeEach
    void setUp() {
        currentAccount = new CurrentAccount(1000F, 12F);
    }

    @Test
    @DisplayName("Should extend from BankAccount")
    void testInheritance() {
        assertTrue(currentAccount instanceof BankAccount);
    }

    @Test
    @DisplayName("Should have an overdraft attribute set to 0")
    void testOverdraft() {
        assertTrue(currentAccount.getOverdraft() == 0F);
    }

    @Test
    @DisplayName("Should allow makeWithdrawal if money_withdrawal is higher than balance and set an overdraft")
    void makeWithdrawal() {
        currentAccount.makeWithdrawal(1200F);
        assertTrue(currentAccount.getBalance() == 0F);
        assertTrue(currentAccount.getOverdraft() == 200F);
    }

    @Test 
    @DisplayName("A deposit should update overdraft and balance")
    void makeDeposit() {
        currentAccount.makeWithdrawal(1200F);       currentAccount.makeDeposit(1000F);
        assertThat(currentAccount.getBalance(), is(800F));
        assertThat(currentAccount.getOverdraft(), is (0F));
    }
    
}