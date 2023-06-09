package BankTest;

import Bank.Bank;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {
    Bank myBankAccount = new Bank();
    @Test public void test_bankCanRegister_newCustomer(){
        myBankAccount.registerNewCustomer("John", "09054498013","1234");
        assertEquals(1, myBankAccount. getCustomersSize());
    }
    @Test public void generateCustomerAccountNumber(){
        myBankAccount.generateCustomerAccountNumberWith("09054498013");
        assertEquals(" 9054498013", myBankAccount.generateCustomerAccountNumberWith("09054498013"));
    }
    @Test public void test_iCan_Deposit(){
        myBankAccount.registerNewCustomer("John", "09054498013","1234");
        String accountNumber = myBankAccount.generateCustomerAccountNumberWith("09054498013");
        myBankAccount.deposit(accountNumber, 2000);
        assertEquals(2000, myBankAccount.getBalance(accountNumber));
    }
    @Test public void test_ICan_Withdraw(){
        myBankAccount.registerNewCustomer("John", "09054498013","1234");
        String accountNumber = myBankAccount.generateCustomerAccountNumberWith("09054498013");
        myBankAccount.deposit(accountNumber, 5000);
        assertEquals(5000, myBankAccount.getBalance(accountNumber));
        myBankAccount.withdraw(accountNumber,"1234",2000);
        assertEquals(3000, myBankAccount.getBalance(accountNumber));
    }
    @Test public void test_ICan_transfer(){
        myBankAccount.registerNewCustomer("John", "09054498013","1234");
        myBankAccount.registerNewCustomer("Paul", "07052456491","2222");
        String firstAccountNumber = myBankAccount.generateCustomerAccountNumberWith("09054498013");
        String secondAccountNumber = myBankAccount.generateCustomerAccountNumberWith("07052456491");
        myBankAccount.deposit(firstAccountNumber, 5000);
        myBankAccount.transferTo(firstAccountNumber,secondAccountNumber,2000,"1234");
        assertEquals(2000, myBankAccount.getBalance(secondAccountNumber));
    }
}
