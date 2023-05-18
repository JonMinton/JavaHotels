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

    public void addGuest(Guest guest) {
        if (this.collection.size() < capacity){
            this.collection.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
//        We might want to use the .contains method to check the guest is in the room first...
            this.collection.remove(guest);
    }

    public int getNumGuests() {
        return this.collection.size();
    }

}
