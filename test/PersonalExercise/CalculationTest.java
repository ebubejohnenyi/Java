package PersonalExercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CalculationTest {
    Calculator simpleCalculator = new Calculator();
    @Test
    public void doesCalculatorExist(){
        assertNotNull(simpleCalculator);
    }

    @Test
    public void addition(){
        simpleCalculator.addition(10,10);
        assertEquals(20, simpleCalculator.result());
    }
    @Test
    public void subtraction(){
        simpleCalculator.subtraction(20,10);
        assertEquals(10, simpleCalculator.result());
    }
    @Test
    public void division(){
        simpleCalculator.division(10,2);
        assertEquals(5, simpleCalculator.result());
    }
}
