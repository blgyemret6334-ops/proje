package nyp05Aralik1;

import java.io.Serializable ;
import java.util.ArrayList;

public class Plane implements Serializable {
	private String tailNumber;
    private PlaneModel planeModel;
    private ArrayList<Flight> AllFlightsOFPlane ;
    
    public Plane(String tailNumber, PlaneModel planeModel) {
        this.tailNumber = tailNumber;
        this.planeModel = planeModel;
  
    }
    public String getTailNumber() { return tailNumber; }
    public PlaneModel getPlaneModel() { return planeModel; }
  
}
