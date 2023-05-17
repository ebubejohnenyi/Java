package ChapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxCalculatorTest {
    TaxCalculator citizenEarnings = new TaxCalculator();
    @Test public void citizenName(){
        citizenEarnings.citizenName("John");
        assertEquals("John", citizenEarnings.getCitizenName());
    }
       @Test public void citizenEarningDiscount(){
        citizenEarnings.calculateCitizenEarningDiscount(-50000);
        assertEquals(0, citizenEarnings.getInitialDiscount());
    }
    @Test public void totalTax(){
        citizenEarnings.totalCitizenTax(50000.0, 1);
        assertEquals(50000.0, citizenEarnings.getTotalTax());
    }
}
