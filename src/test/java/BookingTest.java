import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Bedroom bedroom1;
    private Booking booking1;

    @Before
    public void before(){
        bedroom1 = new Bedroom(23, 2, "double");
        booking1 = new Booking(bedroom1, 2);
//        booking1.addBedroom(bedroom1);
    }

    @Test
    public void hasBedroom(){
        assertEquals(bedroom1, booking1.getBedroom());
    }

    @Test
    public void hasNumberOfNights(){
        assertEquals(2, booking1.getNumberOfNights());
    }

    @Test
    public void canAddNight(){
        booking1.addNights(3);
        assertEquals(5, booking1.getNumberOfNights());
    }
}
