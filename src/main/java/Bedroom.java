import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private String type;
    private int nightlyRate;
    private ArrayList<Guest> guestsInBedroom;

    public Bedroom(int roomNumber, int capacity, String type){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.guestsInBedroom = new ArrayList<Guest>();
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getType(){
        return this.type;
    }

    public int guestCount(){
        return this.guestsInBedroom.size();
    }

    public void addGuest(Guest guest){
        if(guestCount() < this.capacity && !this.guestsInBedroom.contains(guest)){
            this.guestsInBedroom.add(guest);
        }
    }

    public Guest removeGuest(Guest guest){
        if(guestCount() > 0) {
            int indexInArrayList = this.guestsInBedroom.indexOf(guest);
            return this.guestsInBedroom.remove(indexInArrayList);
        }
        return null;
    }
}
