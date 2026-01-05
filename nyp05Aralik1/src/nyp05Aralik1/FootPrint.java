package nyp05Aralik1;

import java.io.Serializable;
import java.time.*;

public class FootPrint implements Serializable {
	private final LocalDate date ;
	private final LocalTime time ;
	private final String text ;
	
	
	
	public FootPrint(LocalDate date, LocalTime time, String text) {
		super();
		this.date = date;
		this.time = time;
		this.text = text;
	}
	

	@Override
	public String toString() { return this.getText(); }
	private String getText() { return text;}
	private LocalTime getTime() { return time;}
	private LocalDate getDate() { return date; }

}
