package com.sapient.services;

public class Bank implements Atm, Agent{

	
	private static Bank bank = new Bank();
	private Bank(){								// make constructor private to restrict other classes making its instances
		
	}
	public static Atm getAtm(){
		Atm atm = bank;
		return atm;
	}
	public static Agent getAgent(){
		Agent agent = bank;
		return agent;
	}
	
	
	public void clearPdc() {
		System.out.println("clear pdc");
		
	}
	
	public void approveLoa() {
		System.out.println("approve loan");
		
	}

	public void withdraw() {
		System.out.println("withdraw");
		
	}
	
	
	public void deposit() {
		System.out.println("deposit");
		
	}
	
	public void getBal() {
		System.out.println("get bal ");
		
	}
	
	
	


}
