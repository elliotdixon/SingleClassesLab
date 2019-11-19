import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle myBottle;

    @Before
    public void before() {
        myBottle = new WaterBottle();
    }

    @Test
    public void hasVolume() {
        assertEquals(100, myBottle.getVolume());
    }

    @Test
    public void drink() {
        myBottle.drink();
        assertEquals(90, myBottle.getVolume());
    }

    @Test
    public void empty() {
        myBottle.empty();
        assertEquals(0, myBottle.getVolume());
    }

    @Test
    public void fillBottle() {
        myBottle.fill();
        assertEquals(100, myBottle.getVolume());
    }


}
