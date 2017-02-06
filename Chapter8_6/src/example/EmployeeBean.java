package example;

import example.PersonBean;

public class EmployeeBean extends PersonBean {
	// Fields:
	private int empID;
	private int startYear;
	private double payRate;
	// Setters:
	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	// Getters:
	public int getEmpID() {
		return this.empID;
	}

	public int getStartYear() {
		return this.startYear;
	}

	public double getPayRate() {
		return this.payRate;
	}
}
