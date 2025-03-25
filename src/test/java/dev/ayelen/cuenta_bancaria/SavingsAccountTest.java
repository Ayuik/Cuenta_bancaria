package dev.ayelen.cuenta_bancaria;

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

}
