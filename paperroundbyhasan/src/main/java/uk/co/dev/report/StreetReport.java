package uk.co.dev.report;


public class StreetReport {

	private boolean isValid;

	public Integer getNoOfHousesInAStreet() {
		return noOfHousesInAStreet;
	}

	public Integer getNoOfHousesInNorthSideOfStreet() {
		return noOfHousesInNorthSideOfStreet;
	}

	public Integer getNoOfHousesInSouthSideOfStreet() {
		return noOfHousesInSouthSideOfStreet;
	}

	private Integer noOfHousesInAStreet;
	private Integer noOfHousesInNorthSideOfStreet;
	private Integer noOfHousesInSouthSideOfStreet;

	public void setNoOfHousesInAStreet(Integer noOfHousesInAStreet) {
		this.noOfHousesInAStreet = noOfHousesInAStreet;
	}

	public void setNoOfHousesInNorthSideOfStreet(Integer noOfHousesInNorthSideOfStreet) {
		this.noOfHousesInNorthSideOfStreet = noOfHousesInNorthSideOfStreet;
	}

	public void setNoOfHousesInSouthSideOfStreet(Integer noOfHousesInSouthSideOfStreet) {
		this.noOfHousesInSouthSideOfStreet = noOfHousesInSouthSideOfStreet;
	}

	@Override
	public String toString() {
		return "StreetReport{" +
				"isValid=" + isValid +
				", noOfHousesInAStreet=" + noOfHousesInAStreet +
				", noOfHousesInNorthSideOfStreet=" + noOfHousesInNorthSideOfStreet +
				", noOfHousesInSouthSideOfStreet=" + noOfHousesInSouthSideOfStreet +
				'}';
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean valid) {
		isValid = valid;
	}
}
