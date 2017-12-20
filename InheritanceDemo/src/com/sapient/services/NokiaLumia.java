package com.sapient.services;

public class NokiaLumia extends Nokia1100{
	
	public double price=25000;
	public void captureImage(){
		System.out.println("capture image");
	}
	
	

	@Override
	public void doConverse() {
		System.out.println("do converse 4g ");
	}



	public void browseNet(){
		System.out.println("brows net ");
	}

}
