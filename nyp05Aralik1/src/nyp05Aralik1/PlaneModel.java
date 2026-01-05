package nyp05Aralik1;

import java.io.Serializable;

public class PlaneModel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String modelName;
    private int businessRow;
    private int economicRow;
    private int avarageVelocity;
    private int consumedFuel;

    public PlaneModel(String modelAd, int bRow, int eRow, int hiz, int yakit) {
        this.modelName = modelAd;
        this.businessRow = bRow;
        this.economicRow = eRow;
        this.avarageVelocity = hiz;
        this.consumedFuel = yakit;
    }

    public String getModelName() {
        return modelName;
    }

    public int getBusinessRow() {
        return businessRow;
    }

    public int getEconomicRow() {
        return economicRow;
    }

    public int getAvarageVelocity() {
        return avarageVelocity;
    }

    public int getConsumedFuel() {
        return consumedFuel;
    }

}
