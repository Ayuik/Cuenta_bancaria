package dev.ayelen.cuenta_bancaria;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SavingsAccountTest {

    SavingsAccount savingsAccount;

    @BeforeEach
    void setUp() {
        savingsAccount = new SavingsAccount(10000F, 24F);
    }

    @Test
    @DisplayName("Should extend from BankAccount")
    void testInheritance() {
        assertTrue(savingsAccount instanceof BankAccount);
    }

    @Test
    @DisplayName("Should have an isActive attribute set to true")
    void testIsActive() {
        assertTrue(savingsAccount.getIsActive());
    }

    @Test
    @DisplayName("isActive should be false if balance is lower that 10000")
    void testIsActive_false() {
        savingsAccount.setBalance(5000);
        savingsAccount.setIsActive();
        assertFalse(savingsAccount.getIsActive());
    }

    @Test
    @DisplayName("Should receive money and update balance if isActive is true")
    void testMakeDeposit(){
        float deposit_money = 4000F;
        savingsAccount.makeDeposit(deposit_money);
        assertThat(savingsAccount.getBalance(), is(14000F));
        assertThat(savingsAccount.getDeposits(), is (1));

        savingsAccount.setBalance(300F);
        savingsAccount.setIsActive();
        savingsAccount.makeDeposit(deposit_money);
        assertThat(savingsAccount.getBalance(), is(300F));
    }

    @Test
    @DisplayName("Should take out money and update balance if isActive is true")
    void testMakeWithdrawal(){
        float withdrawal_money = 4000F;
        savingsAccount.makeWithdrawal(withdrawal_money);
        assertThat(savingsAccount.getBalance(), is(6000F));
        assertThat(savingsAccount.getDeposits(), is (1));

        savingsAccount.setBalance(5000F);
        savingsAccount.setIsActive();
        savingsAccount.makeWithdrawal(withdrawal_money);
        assertThat(savingsAccount.getBalance(), is(5000F));
    }

}
