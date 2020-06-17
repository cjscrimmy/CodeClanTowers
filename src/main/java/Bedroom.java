import java.util.ArrayList;

public class Bedroom {
    private int roomNumber;
    private int capacity;
    private String type;
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

    public void addBedroomGuest(Guest guest){
        if(guestCount() < this.capacity){
            this.guestsInBedroom.add(guest);
        }
    }

//    public void removeBedroomGuest(Guest guest){
//        int indexInArrayList =
//    }
}
