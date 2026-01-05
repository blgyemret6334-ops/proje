package nyp05Aralik1;


import java.io.Serializable;


public class Ticket implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String ticketID;
	private Reservation reservation;
    private double price;
    private int baggageAllowance;
}