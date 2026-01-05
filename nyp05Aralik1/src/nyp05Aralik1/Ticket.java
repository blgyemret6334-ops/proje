package nyp05Aralik1;


import java.io.Serializable;


public class Ticket implements Serializable {
    private String ticketID;
    private Reservation reservation;
    private double price;
    private Baggage baggageAllowance;

    public Ticket(String ticketID, double price, Baggage baggageAllowance) {
        this.ticketID = ticketID;package flightManagementModule;
        import java.io.Serializable;


        public class Ticket implements Serializable {
            private String ticketID;
            private Reservation reservation;
            private double price;
            private Baggage baggageAllowance;

            public Ticket(String ticketID, Reservation reservation, double price, Baggage baggageAllowance) {
                this.ticketID = ticketID;
                this.reservation = reservation;
                this.price = price;
                this.baggageAllowance = baggageAllowance;
            }


            public String getTicketID() {
                return ticketID;
            }


            public Reservation getReservation() {
                return reservation;
            }


            public double getPrice() {
                return price;
            }


            public Baggage getBaggageAllowance() {
                return baggageAllowance;
            }

            @Override
            public String toString() {
                return "Ticket ID: " + ticketID +
                        "\nPrice: " + price +
                        "\nBaggage: " + baggageAllowance.getWeight() + "kg" +
                        "\n--- Reservation Details ---\n" + reservation.toString();
            }


        }
        this.price = price;
        this.baggageAllowance = baggageAllowance;
    }


    public String getTicketID() {
        return ticketID;
    }


    public Reservation getReservation() {
        return reservation;
    }


    public double getPrice() {
        return price;
    }


    public Baggage getBaggageAllowance() {
        return baggageAllowance;
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketID +
                "\nPrice: " + price +
                "\nBaggage: " + baggageAllowance.getWeight() + "kg" +
                "\n--- Reservation Details ---\n" + reservation.toString();
    }


}