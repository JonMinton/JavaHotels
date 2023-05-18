import java.util.ArrayList;

public class Hotel {

    private String name;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(String name){
        this.name = name;
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addBedroom(Bedroom bedroom){
        bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom){
        conferenceRooms.add(conferenceRoom);
    }

    public void checkGuestIntoBedroom(Guest guest, int roomNumber) {
        Bedroom ourBedroom = findRoomByNumber(roomNumber);
        if (ourBedroom != null) {
            ourBedroom.addGuest(guest);
        }
    }

    public void checkoutGuestFromBedroom(Guest guest, int roomNumber){
        Bedroom ourBedroom = findRoomByNumber(roomNumber);
        if (ourBedroom != null) {
            ourBedroom.removeGuest(guest);
        }

    }

    public int getBedroomsCount() {
        return bedrooms.size();
    }

    public int getConferenceRoomsCount() {
        return conferenceRooms.size();
    }


    public Bedroom findRoomByNumber(int roomNumber) {
        Bedroom bedroom = null;
        for (Bedroom broom : this.bedrooms) {
            if (broom.getRoomNumber() == roomNumber) {
                bedroom = broom;
            }
        }
        return bedroom;
    }

    public Booking bookBedroom(int roomNumber, int numNights) {
        Booking booking = null;
        Bedroom bookedRoom = findRoomByNumber(roomNumber);
        if (bookedRoom != null && numNights > 0) {
            booking = new Booking(bookedRoom, numNights);
        }
        return booking;
    }
}
