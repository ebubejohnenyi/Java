package ChapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCalculatorTest {
    CreditLimitCalculator customerChargeAccount = new CreditLimitCalculator();
    @Test public void setBeginningBalance(){
        customerChargeAccount.setUserBeginningBalance(20_000);
        assertEquals(20_000,customerChargeAccount.getUserBeginningBalance());
    }
    @Test public void setItemUserCharge(){
        customerChargeAccount.setUserItemCharge(20);
        assertEquals(20,customerChargeAccount.getUserItemCharge());
    }

    @Test public void setUserCreditApplied(){
        customerChargeAccount.setUserCreditApplied(2000);
        assertEquals(2000, customerChargeAccount.getUserCreditApplied());
    }
    @Test public void setNewiBalance(){
        customerChargeAccount.setUserNewBalance(20_000,20,2000);
        assertEquals(18020, customerChargeAccount.getNewBalance());
    }
}
