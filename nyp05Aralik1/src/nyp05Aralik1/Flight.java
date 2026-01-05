package nyp05Aralik1;



import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;

public class Flight implements Serializable {
    private String flightNum;
    private Route route;
    private Plane plane;
    private LocalDate departureDate;
    private LocalTime departureTime;
    private Map<String, Seat> seatMap; // Bu uçuşun kendi koltuk durumu

    public Flight(String flightNum, Route route, Plane plane, LocalDate departureDate, LocalTime departureTime) {
        this.flightNum = flightNum;
        this.route = route;
        this.plane = plane;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        
        // SeatManager'ı kullanarak bu uçuşa özel bağımsız koltuk haritasını oluşturuyoruz
        this.seatMap = plane.getSeatManager().createSeatsForFlight(plane.getPlaneModel());
    }

    public String getFlightNum() { return flightNum; }
    public Route getRoute() { return route; }
    public Plane getPlane() { return plane; }
    public LocalDate getDepartureDate() { return departureDate; }
    public LocalTime getDepartureTime() { return departureTime; }
    public Map<String, Seat> getSeatMap() { return seatMap; }
}