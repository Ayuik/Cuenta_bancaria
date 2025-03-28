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
        myBankAccount.makeDeposit(deposit_money);
        assertThat(myBankAccount.getBalance(), is(5000F));
        assertThat(myBankAccount.getDeposits(), is (1));
    }

    @Test
    @DisplayName("Should take out money and update balance")
    void testMakeWithdrawal(){
        float withdrawal_money = 400F;
        myBankAccount.makeWithdrawal(withdrawal_money);
        assertThat(myBankAccount.getBalance(), is(600F));
        assertThat(myBankAccount.getWithdrawals(), is (1));
    }

    @Test
    @DisplayName("Should take out money and update balance if the amount of money isn't higher than the balance")
    void testMakeWithdrawal_ifTheAmountOfMoneyIsNotHigherThanTheBalance(){
        float withdrawal_money = 4000F;
        myBankAccount.makeWithdrawal(withdrawal_money);
        assertThat(myBankAccount.getBalance(), is(1000F));
        assertThat(myBankAccount.getWithdrawals(), is (0));
    }

    @Test
    @DisplayName("Should charge a monthlyfee and update balance")
    void testChargeMonthlyfee(){
        myBankAccount.setMonthlyfee(30F);
        myBankAccount.chargeMonthlyfee();
        assertThat(myBankAccount.getBalance(), is (970F));
    }

    @Test
    @DisplayName("Should generate an account statement including the interests")
    void testGenerateAccountStatement(){
        myBankAccount.setMonthlyfee(30F);
        myBankAccount.generateAccountStatement();
        assertThat(myBankAccount.getBalance(), is(979.7F));
    }

    @Test
    @DisplayName("Should print the values of the atributes")
    void testPrint(){
        myBankAccount.setDeposits(2);
        myBankAccount.setMonthlyfee(30F);
        myBankAccount.setWithdrawals(5);
        String values = myBankAccount.print();
        assertThat(values, is("Saldo: " + myBankAccount.getBalance() + 
        "\r\n Número de consignaciones: " + myBankAccount.getDeposits() + 
        "\\r\\n Número de retiros: " + myBankAccount.getWithdrawals() + 
        "\\r\\n Tasa anual: " + myBankAccount.getAnnualinterest() +
        "\r\n Comisión mensual: " + myBankAccount.getMonthlyfee()));
    }
}
