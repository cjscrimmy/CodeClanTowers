import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom confRoom;
    private Guest guest;

    @Before
    public void before(){
        confRoom = new ConferenceRoom(5);
        guest = new Guest("Jojo");
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, confRoom.getCapacity());
    }

    @Test
    public void hasGuestCollection(){
        assertEquals(0, confRoom.getGuestsSize());
    }

    @Test
    public void addGuest(){
        confRoom.addGuest(guest);
        assertEquals(1, confRoom.getGuestsSize());
    }

//
//
//
//
}
