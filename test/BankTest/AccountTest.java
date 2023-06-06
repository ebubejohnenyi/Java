package BankTest;

import Bank.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account myaccount = new Account("name","09054498013","pin");
    @Test public void test_iHave_Account(){
        assertNotNull(myaccount);
    }
    @Test public void test_account_isEmpty(){
        myaccount.isEmpty();
        assertTrue(myaccount.isEmpty());
    }
    @Test public void test_for_Deposit(){
        myaccount.isEmpty();
        myaccount.deposit(5000);
        assertEquals(5000, myaccount.getBalance());
    }
    @Test public void test_I_can_withdraw(){
        myaccount.isEmpty();
        myaccount.deposit(5000);
        myaccount.setPin("1234");
        myaccount.withdraw("1234",500);
        assertEquals(4500, myaccount.getBalance());
    }
    @Test public void test_I_can_checkBalance(){
        myaccount.isEmpty();
        myaccount.deposit(5000);
        myaccount.setPin("1234");
        myaccount.withdraw("1234", 2000);
        myaccount.checkBalance("1234");
        assertEquals(3000, myaccount.getBalance());
    }
}
