import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiningRoomTest {

    DiningRoom diningRoom;

    @Before
    public void setUp() {
        diningRoom = new DiningRoom("The Round Table", RoomType.SMALL_DINING_ROOM);
    }

    @Test
    public void diningRoomHasExpectedCapacity() {
        assertEquals(12, diningRoom.getCapacity());
    }
}
