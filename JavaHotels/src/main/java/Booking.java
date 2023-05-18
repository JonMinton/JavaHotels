public class Booking {

    private Bedroom bedroom;
    private int numNights;

    public Booking(Bedroom bedroom, int numNights) {
        this.bedroom = bedroom;
        this.numNights = numNights;
    }

    public Bedroom getBedroom() {
        return bedroom;
    }

    public int getNumNights() {
        return numNights;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public void setNumNights(int numNights) {
        this.numNights = numNights;
    }

    public double getTotalBill() {
        return this.bedroom.getNightlyRate() * this.numNights;
    }
}
