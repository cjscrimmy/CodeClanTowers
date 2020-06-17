import java.util.ArrayList;

public class ConferenceRoom {
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom(int capacity) {
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getConfGuestsSize() {
        return this.guests.size();
    }

    public boolean isConferenceRoomFull(){
        return getConfGuestsSize() >= this.capacity;
    }

    public void addConfGuest(Guest guest){
        if(!isConferenceRoomFull()) {
            this.guests.add(guest);
        }
    }
}
