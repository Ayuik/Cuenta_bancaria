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
}