package uk.co.dev.report;

import java.util.List;

public class DeliveryReport {

	private List<Integer> orderOfHouse;

	@Override
	public String toString() {
		return "DeliveryReport{" +
				"orderOfHouse=" + orderOfHouse +
				", noOfTimeRoadCrosed=" + noOfTimeRoadCrosed +
				'}';
	}

	public List<Integer> getOrderOfHouse() {
		return orderOfHouse;
	}

	public void setOrderOfHouse(List<Integer> orderOfHouse) {
		this.orderOfHouse = orderOfHouse;
	}

	public Integer getNoOfTimeRoadCrosed() {
		return noOfTimeRoadCrosed;
	}

	public void setNoOfTimeRoadCrosed(Integer noOfTimeRoadCrosed) {
		this.noOfTimeRoadCrosed = noOfTimeRoadCrosed;
	}

	private Integer noOfTimeRoadCrosed;


}
