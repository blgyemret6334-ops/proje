package nyp05Aralik1;


import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class SeatManager implements Serializable {

   


    public Map<String, Seat> createSeatsForFlight(PlaneModel model) {
        Map<String, Seat> seatMap = new HashMap<>();

        // Business Sınıfı Koltukları (A, B, C, D düzeni)
        for (int i = 1; i <= model.getBusinessRow(); i++) {
            for (char c : new char[]{'A', 'B', 'C', 'D'}) {
                String code = c + String.valueOf(i);
                seatMap.put(code, new Seat(code, TicketClass.BUSINESS));
            }
        }

        // Economy Sınıfı Koltukları (A, B, C, D, E, F düzeni)
        int ecoStart = model.getBusinessRow() + 1;
        int ecoEnd = model.getBusinessRow() + model.getEconomicRow();
        for (int i = ecoStart; i <= ecoEnd; i++) {
            for (char c : new char[]{'A', 'B', 'C', 'D', 'E', 'F'}) {
                String code = c + String.valueOf(i);
                seatMap.put(code, new Seat(code, TicketClass.ECONOMY));
            }
        }
        return seatMap;
    }
}