import java.util.ArrayList;

public abstract class Room {

    private int capacity;
    private ArrayList<Guest> collection;

    public Room(int capacity) {
        this.capacity = capacity;
        this.collection = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayList<Guest> getCollection() {
        return collection;
    }

}
