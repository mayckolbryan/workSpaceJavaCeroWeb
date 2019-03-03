package com.mitocode.entities;

public class Individual extends TaxPayer{

	//Gasto Salud
	private Double health;
	
	public Individual(String name, Double anualIncome, Double health) {
		super(name, anualIncome);
		this.health = health;
	}

	@Override
	public Double tax() {
		double taxResult;
		if (this.getAnualIncome() < 20000.0) {
			taxResult = this.getAnualIncome()*0.15 - health*0.5;
		}else {
			taxResult = this.getAnualIncome()*0.25 - health*0.5;
		}
		return taxResult;
	}

	public Double getHealth() {
		return health;
	}

	public void setHealth(Double health) {
		this.health = health;
	}
}
