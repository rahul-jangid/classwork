package com.sapient.client;

import com.sapient.services.Nokia1100;
import com.sapient.services.NokiaLumia;

public class NokiaClient {

	public static void main(String[] args) {
		Nokia1100 mobile = new NokiaLumia();
		mobile.doConverse();
	//	mobile.sendSms();
//		System.out.println(mobile.price);
//		mobile.captureImage();
//		mobile.browseNet();

	}

}
