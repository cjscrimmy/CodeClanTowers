import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom confRoom;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;

    @Before
    public void before(){
        confRoom = new ConferenceRoom("Bizarre Adventure", 3);
        guest1 = new Guest("Jojo");
        guest2 = new Guest("Jojo the son");
        guest3 = new Guest("Jojo the grand son");
        guest4 = new Guest("Dio");
    }

    @Test
    public void hasName(){
        assertEquals("Bizarre Adventure", confRoom.getName());
    }

    @Test
    public void hasCapacity(){
        assertEquals(3, confRoom.getCapacity());
    }

    @Test
    public void hasGuestCollection(){
        assertEquals(0, confRoom.guestCount());
    }

    @Test
    public void addGuest(){
        confRoom.addGuest(guest1);
        assertEquals(1, confRoom.guestCount());
        confRoom.addGuest(guest2);
        confRoom.addGuest(guest2);
        assertEquals(2, confRoom.guestCount());
        confRoom.addGuest(guest3);
        confRoom.addGuest(guest4);
        assertEquals(3, confRoom.guestCount());
    }

    @Test
    public void removeGuest(){
        confRoom.addGuest(guest4);
        assertEquals(guest4, confRoom.removeGuest(guest4));
        assertEquals(null, confRoom.removeGuest(guest4));
    }
}
