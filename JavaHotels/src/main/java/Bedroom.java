public class Bedroom extends Room {

    private int roomNumber;
    private double nightlyRate;
    private RoomType roomType;

    public Bedroom(int roomNumber, RoomType roomType, double nightlyRate){
        super(roomType.getCapacity());
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.nightlyRate = nightlyRate;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public double getNightlyRate() {
        return this.nightlyRate;
    }
}
