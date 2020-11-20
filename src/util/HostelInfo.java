/*
Here I receive and send my vector data
Check Hostel.Java
 */
package util;

public class HostelInfo {
    private String guestName;
    private String guestEmail;
    private int roomNumber;

    public HostelInfo(String guestName, String guestEmail, int roomNumber) {
        this.guestName = guestName;
        this.guestEmail = guestEmail;
        this.roomNumber = roomNumber;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public String getGuestEmail() {
        return guestEmail;
    }

    public void setGuestEmail(String guestEmail) {
        this.guestEmail = guestEmail;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }
}
