package nyp05Aralik1;

import java.time.LocalDateTime;
import java.io.Serializable;


public class Reservation implements Serializable {
    private String reservationCode;
    private Flight flight;
    private Passenger passenger;
    private Seat seat;
    private LocalDateTime dateOfReservation ;
    

}
