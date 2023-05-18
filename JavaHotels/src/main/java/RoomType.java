public enum RoomType {
    SINGLE(1),
    DOUBLE(2),
    PENTHOUSE(15),
    SMALL_BOARDROOM(5),
    LARGE_BOARDROOM(10),
    WING(50),
    MAIN_HALL(100);

    private final int capacity;

    RoomType(int capacity){
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}
