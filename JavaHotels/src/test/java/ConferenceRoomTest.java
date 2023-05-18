import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    @Before
    public void setUp() {
        conferenceRoom = new ConferenceRoom("The Brown Room", RoomType.SMALL_BOARDROOM, false);
    }

    @Test
    public void conferenceRoomHasName() {
        assertEquals("The Brown Room", conferenceRoom.getRoomName());
    }

    @Test
    public void conferenceRoomHasCapacity() {
        assertEquals(5, conferenceRoom.getCapacity());
    }

    @Test
    public void conferenceRoomIsNotExecutive() {
        assertEquals(false, conferenceRoom.getIsExecutive());
    }
}
