import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    Bedroom bedroom1;
    Bedroom bedroom2;
    Guest guest1;
    Guest guest2;
    Guest guest3;

    @Before
    public void before(){
        bedroom1 = new Bedroom(14, 2, "double");
        bedroom2 = new Bedroom(5, 1, "single");
        guest1 = new Guest("Bill Bryson");
        guest2 = new Guest("Bob Monkhouse");
        guest3 = new Guest("Steven Briggs");

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

    @Test
    public void hasNoGuestsInRoom(){
        assertEquals(0, bedroom2.guestCount());
    }

    @Test
    public void canAddGuestToRoom(){
        bedroom1.addBedroomGuest(guest1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void cantAddGuestToFullRoom(){
        bedroom2.addBedroomGuest(guest1);
        bedroom2.addBedroomGuest(guest2);
        assertEquals(1, bedroom2.guestCount());
    }

    @Test
    public void cantAddGuestToBedroomTwice(){
        bedroom1.addBedroomGuest(guest1);
        bedroom1.addBedroomGuest(guest1);
        assertEquals(1, bedroom1.guestCount());
    }

    @Test
    public void canRemoveGuestFromBedroom(){
        bedroom1.addBedroomGuest(guest3);
        bedroom1.removeBedroomGuest(guest3);
        assertEquals(0, bedroom1.guestCount());
    }

    @Test
    public void cantRemoveFromEmptyBedroom(){
        bedroom2.removeBedroomGuest(guest1);
        assertEquals(0, bedroom2.guestCount());
    }
}
