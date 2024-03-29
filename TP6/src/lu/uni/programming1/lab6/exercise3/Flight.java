package lu.uni.programming1.lab6.exercise3;

public class Flight {
	
	private String number;
	private Airport origin;
	private Airport destination;
	
	public Flight(String number, Airport origin, Airport destination) {
		this.number = number;
		this.origin = origin;
		this.destination = destination;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Airport getOrigin() {
		return origin;
	}

	public void setOrigin(Airport origin) {
		this.origin = origin;
	}

	public Airport getDestination() {
		return destination;
	}

	public void setDestination(Airport destination) {
		this.destination = destination;
	}
	
	@Override
	public String toString() {
		return String.format("Flight %s from %s to %s", this.number, this.origin, this.destination);
	}
}