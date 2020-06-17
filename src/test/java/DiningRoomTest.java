import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class DiningRoomTest {

    private DiningRoom diningroom1;
    private Guest guest1;
    private Guest guest2;

    @Before
    public void before(){
        guest1 = new Guest("Tim");
        guest2 = new Guest("Bob");
        diningroom1 = new DiningRoom("French");
    }

    @Test
    public void hasName(){
        assertEquals("French", diningroom1.getName());
    }

    @Test
    public void hasGuests(){
        assertEquals(2, diningroom1.getGuests());
    }
}
