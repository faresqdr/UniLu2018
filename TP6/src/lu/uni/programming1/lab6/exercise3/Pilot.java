package lu.uni.programming1.lab6.exercise3;

public class Pilot extends Person {

	private String airline;

	public Pilot(String name, String passportNumber, String airline) {
		super(name, passportNumber);
		this.airline = airline;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}
	
	@Override
	public String toString() {
		return String.format("%s (%s)", super.toString(), this.airline);
	}
}