package com.dyashin.spcore;

public class Bus implements Vehicle {
	private Discount discountsirdiscount;

//	public Bus(Discount discountsirdiscount) {
//		this.discountsirdiscount= discountsirdiscount;
//	}
//	
     public Bus() {
    	 
     }

	public void setDiscountsirdiscount(Discount discountsirdiscount) {
		this.discountsirdiscount = discountsirdiscount;
	}


	@Override
	public String milage() {
		// TODO Auto-generated method stub
		return "Bus mileage is 25 km/l";
	}

	@Override
	public String getDiscount() {
		// TODO Auto-generated method stub
		return discountsirdiscount.getDiscount();
	}

}
