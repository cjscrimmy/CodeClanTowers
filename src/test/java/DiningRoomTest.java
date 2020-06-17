import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        diningroom1.addGuest(guest1);
        diningroom1.addGuest(guest2);
        assertEquals(2, diningroom1.getGuests());
    }
}
