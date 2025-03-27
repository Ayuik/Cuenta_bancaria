package dev.ayelen.cuenta_bancaria;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CurrentAccountTest {

    @Test
    @DisplayName("Should extend from BankAccount")
    void testInheritance() {
        CurrentAccount currentAccount = new CurrentAccount(1000F, 12F);
        assertTrue(currentAccount instanceof BankAccount);
    }

    @Test
    @DisplayName("Should allow makeWithdrawal if money_withdrawal is higher than balance and set an overdraft")
    void makeWithdrawal() {
        CurrentAccount currentAccount = new CurrentAccount(1000F, 12F);
        currentAccount.makeWithdrawal(1200F);
        assertTrue(currentAccount.getBalance() == 0F);
        assertTrue(currentAccount.getOverdraft() == 200F);
    }
}