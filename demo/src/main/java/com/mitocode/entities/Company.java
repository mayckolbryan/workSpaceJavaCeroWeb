package com.mitocode.entities;

public class Company extends TaxPayer{

	private Integer numberOfEmployees;
	
	public Company(String name, Double anualIncome, Integer numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		double taxResult;
		if (this.numberOfEmployees < 10) {
			taxResult = this.getAnualIncome()*0.14;
		}else {
			taxResult = this.getAnualIncome()*0.15;
		}
		return taxResult;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
}
