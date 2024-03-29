package lu.uni.programming1.lab6.exercise3;

public class Person {

	private String name;
	private String passportNumber;
	
	public Person(String name, String passportNumber) {
		this.name = name;
		this.passportNumber = passportNumber;
	}

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return this.name;
	}	
}