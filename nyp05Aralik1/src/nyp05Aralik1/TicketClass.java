package nyp05Aralik1;

import java.io.Serializable;

public enum TicketClass implements Serializable{
    BUSINESS(1.5, 40), 
    ECONOMY(1.0, 20);  

    private final double priceMultiplier;
    private final int baggageAllowance;

    TicketClass(double priceMultiplier, int baggageAllowance) {
        this.priceMultiplier = priceMultiplier;
        this.baggageAllowance = baggageAllowance;
    }

    public double getPriceMultiplier() { return priceMultiplier; }
    public int getBaggageAllowance() { return baggageAllowance; }
}