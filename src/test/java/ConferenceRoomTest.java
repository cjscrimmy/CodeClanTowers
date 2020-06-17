import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom confRoom;
    private Guest guest;

    @Before
    public void before(){
        confRoom = new ConferenceRoom(5);
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, confRoom.getCapacity());
    }

    @Test
    public void hasGuestCollection(){
        assertEquals(0, confRoom.getGuestsSize());
    }
}
