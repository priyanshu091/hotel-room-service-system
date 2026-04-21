public class Guest {

    private String custName;
    private   int roomNum;
    private String roomType;

    public Guest(String custName, int roomNum, String roomType) {
        this.custName = custName;
        this.roomNum = roomNum;
        this.roomType = roomType;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        roomType = roomType;
    }
}
