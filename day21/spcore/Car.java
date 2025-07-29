package com.dyashin.spcore;

public class Car implements Vehicle {
	private Discount discountsirdiscount;

//	public Car(Discount discountsirdiscount) {
//		this.discountsirdiscount= discountsirdiscount;
//	}
	public Car() {
		
	}
	
	public void setDiscountsirdiscount(Discount discountsirdiscount) {
		this.discountsirdiscount = discountsirdiscount;
	}

	@Override			
	public String milage() {
		return "Car mileage is 15 km/l";
	}
	
	@Override
	public String getDiscount() {
		return  discountsirdiscount.getDiscount();
	}

}
