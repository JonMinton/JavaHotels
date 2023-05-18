import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom singleBedroom;
    Bedroom penthouse;
    @Before
    public void before() {
        singleBedroom = new Bedroom(13, RoomType.SINGLE);
        penthouse = new Bedroom(113, RoomType.PENTHOUSE);
    }

    @Test
    public void canGetCapacitySingle() {
        assertEquals(1, singleBedroom.getCapacity());
    }

    @Test
    public void canGetCapacityPenthouse() {
        assertEquals(15, penthouse.getCapacity());
    }
}
