package nyp05Aralik1;

import java.io.Serializable;

public class Seat implements Serializable {
    private String seatCode;
    private TicketClass ticketClass;
    private boolean isReserved;

    public Seat(String seatCode, TicketClass ticketClass) {
        this.seatCode = seatCode;
        this.ticketClass = ticketClass;
        this.isReserved = false;
    }

    public void reserve() { this.isReserved = true; }
    public void unReserve() { this.isReserved = false; }
    public boolean isReserved() { return isReserved; }
    public TicketClass getTicketClass() { return ticketClass; }
    public String getSeatCode() { return seatCode; }
}