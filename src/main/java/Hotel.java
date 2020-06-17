import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> confRooms;
    private ArrayList<Booking> bookings;
    private HashMap<String, DiningRoom> diningRooms;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.confRooms = new ArrayList<ConferenceRoom>();
        this.bookings = new ArrayList<Booking>();
        this.diningRooms = new HashMap<String, DiningRoom>();
    }

    public int bedroomCount(){
        return this.bedrooms.size();
    }

    public int bookingCount(){
        return this.bookings.size();
    }

    public int diningRoomCount(){
        return this.diningRooms.size();
    }

    public int confRoomCount(){
        return this.confRooms.size();
    }

    public void addBedroom(Bedroom bedroom){
        this.bedrooms.add(bedroom);
    }

    public void addConfRoom(ConferenceRoom confRoom){
        this.confRooms.add(confRoom);
    }

    public void checkInBedroom(Guest guest, Bedroom room){
        room.addGuest(guest);
    }

    public void checkInConfRoom(Guest guest, ConferenceRoom room){
        room.addGuest(guest);
    }
    
    public Guest checkOutBedroom(Guest guest, Bedroom room){
        return room.removeGuest(guest);
    }

    public Guest checkOutConfRoom(Guest guest, ConferenceRoom room){
        return room.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights){
        Booking booking = new Booking(bedroom, numberOfNights);
        addBooking(booking);
        return booking;
    }

    public void addBooking(Booking booking){
        bookings.add(booking);
    }

    public void addDiningRoom(DiningRoom diningRoom){
        diningRooms.put(diningRoom.getName(), diningRoom);
    }

}
