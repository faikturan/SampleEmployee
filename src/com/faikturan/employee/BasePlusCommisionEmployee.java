package com.faikturan.employee;

public class BasePlusCommisionEmployee extends CommissionEmployee {

	private double baseSalary;
	
	
	public BasePlusCommisionEmployee(String first, String last, String ssn, 
			double sales, double rate, double salary) {
		super(first, last, ssn, sales, rate);
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary(double salary) {
		baseSalary = (salary < 0.0) ? 0.0 : salary;
	}
	
	@Override
	public double earnings() {
		return getBaseSalary() + super.earnings();
	}
	
	@Override
	public String toString() {
		return String.format("%s %s; %s: $%,.2f",
				"base-salaried", super.toString(),
				"base salary", getBaseSalary());
	}

}
