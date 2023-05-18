public class ConferenceRoom extends Room{

    private String roomName;
    private RoomType roomType;

    private boolean isExecutive;

    public ConferenceRoom(String roomName, RoomType roomType, boolean isExecutive){
        super(roomType.getCapacity());
        this.roomName = roomName;
        this.roomType = roomType;
        this.isExecutive = isExecutive;
    }

    public String getRoomName() {
        return this.roomName;
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public boolean getIsExecutive() {
        return this.isExecutive;
    }




}
