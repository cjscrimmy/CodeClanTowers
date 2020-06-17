import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private ConferenceRoom confRoom1;
    private ConferenceRoom confRoom2;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private Guest guest1;
    private Hotel hotel;

    @Before
    public void before(){
        confRoom1 = new ConferenceRoom("Crazy Conference Room", 3);
        confRoom2 = new ConferenceRoom("Final Conference Room", 5);
        bedroom1 = new Bedroom(20, 2, "double");
        bedroom2 = new Bedroom(13, 1, "single");
        guest1 = new Guest("Michael Jackson");
        hotel = new Hotel();
    }

    @Test
    public void canAddBedroom(){
        hotel.addBedroom(bedroom1);
        assertEquals(1, hotel.bedroomCount());
    }

    @Test
    public void canAddConfRoom(){
        hotel.addBedroom(confRoom1);
        assertEquals(1, hotel.confRoomCount());
    }

    @Test
    public void canCheckIn(){
        hotel.checkIn(guest1, hotel.bedrooms.get(1));
        assertEquals(1, bedroom1.guestCount());
        hotel.checkIn(guest1, hotel.confRooms.get(1));
        assertEquals(1, confRoom1.guestCount());
    }
}
