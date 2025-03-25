package dev.ayelen.cuenta_bancaria;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SavingsAccountTest {

    SavingsAccount savingsAccount;

    @BeforeEach
    void setUp(){
        savingsAccount = new SavingsAccount(10000F, 24F);
    }

    @Test
    @DisplayName("Should extend from BankAccount")
    void testInheritance(){
        assertTrue(savingsAccount instanceof BankAccount);
    }

    @Test
    @DisplayName("Should have an isActive attribute set to true")
    void testIsActive(){
        assertTrue(savingsAccount.getIsActive());
    }
    
    
}
