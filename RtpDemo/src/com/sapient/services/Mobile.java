package com.sapient.services;

public class Mobile extends Product {
	private String camPx;

	public Mobile(int prodId, String prodName, double price, String camPx) {
		super(prodId, prodName, price);
		this.camPx = camPx;
	}

	@Override
	public String isExpensive() {
		double price = getPrice();
		String res = null;
		if(price>= 10000)
			res = "expensive";
		else if(price>=5000)
			res = "average";
		else
			res ="cheap";
		return res;
	}

	@Override
	public void display() {
		super.display();
		System.out.printf("%10s%30s%20s",camPx,isExpensive(),getClass().getName());
	}
	
	

}
