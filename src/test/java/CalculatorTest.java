import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void add(){
        assertEquals(25, calculator.add(5, 20));
    }
    @Test
    public void subtract(){
        assertEquals(15, calculator.subtract(20, 5));
    }
    @Test
    public void multiply(){
        assertEquals(20, calculator.multiply(5, 4));
    }
    @Test
    public void divide(){
        assertEquals(5, calculator.divide(20, 4));
    }

}
