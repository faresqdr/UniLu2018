package lu.uni.programming1.lab6.exercise3;

public class Airport {

	private String city;
	private String country;
	private String iataCode;
	
	public Airport(String city, String country, String iataCode) {
		this.city = city;
		this.country = country;
		this.iataCode = iataCode;
	}

	public String getCity() {
		return city;
	}
	
	public String getCountry() {
		return country;
	}
	
	public String getIataCode() {
		return iataCode;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s (%s)", this.city, this.country, this.iataCode);
	}
}