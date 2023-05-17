package ChapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesCommissionCalculatorTest {
    SalesCommissionCalculator salesCommission = new SalesCommissionCalculator();
    @Test public void salesItemAndValue(){
        salesCommission.itemsSoldForLastWeek(1,2,3,4);
        assertEquals(2202.9, salesCommission.getValueSoldForLastWeek());
    }
    @Test public void salesPersonCommission(){
        salesCommission.salesPersonCommission(2202.9, 0.09);
        assertEquals(198.261, salesCommission.getCommissionForLastWeek());
    }
    @Test public void salesPersonCommissionForWeek(){
        salesCommission.salesPersonCommissionForWeek(198.261);
        assertEquals(398.26099999999997, salesCommission.getSalePersonSalary());
    }
}
