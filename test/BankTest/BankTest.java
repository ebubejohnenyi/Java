package BankTest;

import Bank.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    Bank myBankAccount = new Bank();
    @Test public void test_bankCanRegister_newCustomer(){
        myBankAccount.registerNewCustomer("John", "09054498013");
        assertEquals(1, myBankAccount. getCustomersSize());
    }
    @Test public void generateCustomerAccountNumber(){
        myBankAccount.generateCustomerAccountNumberWith("09054498013");
        assertEquals("9054498013", myBankAccount.generateCustomerAccountNumberWith("09054498013"));
    }
    @Test public void test_iCan_Deposit(){
        myBankAccount.registerNewCustomer("John", "09054498013");
        assertEquals(1, myBankAccount.getCustomersSize());
        myBankAccount.generateCustomerAccountNumberWith("09054498013");
        assertEquals("9054498013", myBankAccount.generateCustomerAccountNumberWith("09054498013"));
        myBankAccount.deposit("9054498013", 2000);
    }
}
