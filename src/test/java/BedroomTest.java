import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom1;
    Bedroom bedroom2;

    @Before
    public void before(){
        bedroom1 = new Bedroom(14, 2, "double");
        bedroom2 = new Bedroom(5, 1, "single");
    }

    @Test
    public void hasRoomNumber(){
        assertEquals(14, bedroom1.getRoomNumber());
    }

    @Test
    public void hasBedroomCapacity(){
        assertEquals(1, bedroom2.getCapacity());
    }

    @Test
    public void hasBedroomType(){
        assertEquals("double", bedroom1.getType());
    }

//    @Test
//    public void hasNoGuestsInRoom(){
//        assertEquals(0, bedroom2.guestCount());
//    }
}
