import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking1;
    private Bedroom bedroom1;

    @Before
    public void before(){
        booking1 = new Booking(bedroom1, 2);
        bedroom1 = new Bedroom(23, 2, "double");
    }

    @Test
    public void hasBedroom(){
        assertEquals(bedroom1, booking1.getBedroom());
    }

    @Test
    public void hasNumberOfNights(){
        assertEquals(2, booking1.numberOfNights());
    }

    @Test
    public void canAddNight(){
        booking1.addNights(3);
        assertEquals(3, booking1.numberOfNights());
    }
}
