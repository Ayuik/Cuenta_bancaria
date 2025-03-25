package dev.ayelen.cuenta_bancaria;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SavingsAccountTest {

    @Test
    @DisplayName("Should extend from BankAccount")
    void testInheritance(){
        SavingsAccount savingsAccount = new SavingsAccount();
        assertTrue(savingsAccount instanceOf BankAccount);
    }
    
}
