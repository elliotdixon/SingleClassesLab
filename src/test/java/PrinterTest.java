import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer myPrinter;

    @Before
    public void before() {
        myPrinter = new Printer(50, 100);
    }

    @Test
    public void hasPaper() {
        assertEquals(50, myPrinter.paperLeft());
    }


    @Test
    public void hasToner() {
        assertEquals(100, myPrinter.tonerLeft());
    }

    @Test
    public void print2copiesof5pages() {
        myPrinter.print(5, 2);
        assertEquals(30, myPrinter.paperLeft());
        assertEquals(100, myPrinter.tonerLeft());
    }

    @Test
    public void cannotPrint() {
        myPrinter.print(40, 3);
        assertEquals(50, myPrinter.paperLeft());
        assertEquals(100, myPrinter.tonerLeft());
    }

    @Test
    public void refillTo100Pages() {
        myPrinter.refill(50);
        assertEquals(100, myPrinter.paperLeft());
    }


}
