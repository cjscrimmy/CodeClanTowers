public class Booking {

    private Bedroom bedroom;
    private int numberOfNights;

    public Booking(Bedroom bedroom, int numberOfNights){
        this.bedroom = bedroom;
        this.numberOfNights = numberOfNights;
    }

    public int getNumberOfNights(){
        return this.numberOfNights;
    }

    public Bedroom getBedroom(){
        return this.bedroom;
    }

    public void addNights(int number){
        this.numberOfNights += number;
    }

    public int totalBill(){
        return this.numberOfNights * this.bedroom.getNightlyRate();
    }
}
