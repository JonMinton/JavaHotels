import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;

    Guest guest1;
    Guest guest2;
    Guest guest3;
    Bedroom room42;


    @Before
    public void before() {
        hotel = new Hotel("Crapston Villas");

        hotel.addBedroom(
                new Bedroom(13, RoomType.SINGLE, 39.50)
        );
        room42 =  new Bedroom(42, RoomType.DOUBLE, 51.10);
        hotel.addBedroom(room42);
        hotel.addBedroom(
                new Bedroom(101, RoomType.PENTHOUSE, 1899.05)
        );
        hotel.addBedroom(
                new Bedroom(4, RoomType.SINGLE, 41.20)
        );

        hotel.addConferenceRoom(
                new ConferenceRoom("The Brown Room", RoomType.SMALL_BOARDROOM, false)
        );
        hotel.addConferenceRoom(
                new ConferenceRoom("The Golden Ballroom", RoomType.WING, true)
        );
        guest1 = new Guest("Brian");
        guest2 = new Guest("Steve");
        guest3 = new Guest("Brenda");
    }

    @Test
    public void canGetNumBedrooms() {
        assertEquals(4, hotel.getBedroomsCount());
    }

    @Test
    public void canGetNumConferenceRooms() {
        assertEquals(2, hotel.getConferenceRoomsCount());
    }

    @Test
    public void canFindRoomByRoomNumber(){
        assertEquals(room42, hotel.findRoomByNumber(42));
    }

    @Test
    public void cannotFindNonExistentRoom() {
        assertEquals(null, hotel.findRoomByNumber(74));
    }

    @Test
    public void canCheckInGuestIntoExistingBedroom(){
        hotel.checkGuestIntoBedroom(guest1, 42);
        assertEquals(1, hotel.findRoomByNumber(42).getNumGuests());
    }

    @Test
    public void cannotCheckInMoreGuestsThanCapacity() {
        assertEquals(0, hotel.findRoomByNumber(42).getNumGuests());

        hotel.checkGuestIntoBedroom(guest1, 42);
        hotel.checkGuestIntoBedroom(guest2, 42);
        assertEquals(2, hotel.findRoomByNumber(42).getNumGuests());

        hotel.checkGuestIntoBedroom(guest3, 42);
        assertEquals(2, hotel.findRoomByNumber(42).getNumGuests());

    }

    @Test
    public void canCheckoutGuestAfterCheckingIn() {
        hotel.checkGuestIntoBedroom(guest1, 42);
        assertEquals(1, hotel.findRoomByNumber(42).getNumGuests());
        hotel.checkoutGuestFromBedroom(guest1, 42);
        assertEquals(0, hotel.findRoomByNumber(42).getNumGuests());

    }

    @Test
    public void cannotCheckoutGuestNotInRoom() {
        hotel.checkGuestIntoBedroom(guest1, 42);
        assertEquals(1, hotel.findRoomByNumber(42).getNumGuests());
        hotel.checkoutGuestFromBedroom(guest2, 42);
        assertEquals(1, hotel.findRoomByNumber(42).getNumGuests());
    }

    @Test
    public void canBookANight() {
//        Booking booking = new Booking(room42, 1);
        Booking booking = hotel.bookBedroom(42, 1);
        int expectedBedroomBooked = booking.getBedroom().getRoomNumber();
        int expectedNightsBooked = booking.getNumNights();
        assertEquals(42, expectedBedroomBooked);
        assertEquals(1, expectedNightsBooked);
    }

    @Test
    public void cannotBookNegativeNights() {

        Booking booking = hotel.bookBedroom(42, -4);
        assertEquals(null, booking);
    }
}
