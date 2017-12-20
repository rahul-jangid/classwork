package com.sapient.services;

public class Loan extends Account{

	public Loan(int accId, String custName, double bal) {
		super(accId, custName, bal);
		
	}

	@Override
	public String deposit(double amt) {
		String res = "loan already cleared";
		double bal=0;
		if(getBal()>0 && amt<=getBal() ){
			bal = getBal()-amt;
			setBal(bal);
			res = "deposited";
		}
		if(getBal()>0 && amt> getBal()){
			bal = 0;
			setBal(0);
			res="deposited and loan cleared";
		}
		else
			res ="loan already cleared";
		return res;
	}
	

}
