import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;

    @Before
    public void setUp(){

        bedroom = new Bedroom(42, RoomType.DOUBLE, 51.10);
        booking = new Booking(bedroom, 5);
    }

    @Test
    public void canCalculateTotalBookingCost() {
        assertEquals(255.50, booking.getTotalBill(), 0.01);
    }


}
