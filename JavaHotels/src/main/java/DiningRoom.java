import java.util.ArrayList;

public class DiningRoom extends Room{

    private String name;


    public DiningRoom(String name, RoomType roomType) {
        super(roomType.getCapacity());
        this.name = name;
    }


}
//    Add a DiningRoom class with a name, capacity, and collection of guests