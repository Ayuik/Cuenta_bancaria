package dev.ayelen.cuenta_bancaria;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SavingsAccountTest {

    @Test
    @DisplayName("Should extend from BankAccount")
    void testInheritance(){
        SavingsAccount savingsAccount = new SavingsAccount(2000F, 24F);
        assertTrue(savingsAccount instanceof BankAccount);
    }

    @Test
    @DisplayName("Should have an isActive attribute set to true")
    void testIsActive(){
        SavingsAccount savingsAccount = new SavingsAccount(10000F, 24F);
        assertTrue(savingsAccount.getIsActive());
    }
    
}
