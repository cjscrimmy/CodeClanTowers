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

    public int getGuestsSize() {
        return this.guests.size();
    }

    public boolean isRoomFull(){
        return getGuestsSize() >= this.capacity;
    }

    public void addGuest(Guest guest){
        if(!isRoomFull() && !this.guests.contains(guest)) {
            this.guests.add(guest);
        }
    }

    public Guest removeGuest(Guest guest){
        if(this.guests.contains(guest)){
            int index = guests.indexOf(guest);
            return this.guests.remove(index);
        }
        return null;
    }
}
