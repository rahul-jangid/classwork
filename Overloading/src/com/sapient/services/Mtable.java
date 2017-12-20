package com.sapient.services;

public class Mtable {			// immutable class data will be given in constructor
	
	private int num;
	
	public Mtable(int num) throws Exception{			// validation must be in constructor
		super();
		if(num<=0)
			throw new Exception("number must be greater than zero ");
		this.num= num;
		
	}
	
	public void display(){
		for(int i=1;i<=10; ++i){
			System.out.printf("%d * %d  = %d \n", num, i,(num*i));
		}
		
	}
	public void display(int row){
		for(int i=1;i<=row; ++i){
			System.out.printf("%d * %d  = %d \n", num, i,(num*i));
		}		
	}
	public void display(int start, int end){
		for(int i=start; i<= end ;++i){
			System.out.printf("%d * %d  = %d \n", num, i,(num*i));
		}
		
	}

}
