package com.sapient.client;

import com.sapient.services.Atm;
import com.sapient.services.Bank;

public class BankClient {

	public static void main(String[] args) {
		Atm atm = Bank.getAtm();
		atm.deposit();
		atm.withdraw();
		atm.getBal();
		
		
	}

}
