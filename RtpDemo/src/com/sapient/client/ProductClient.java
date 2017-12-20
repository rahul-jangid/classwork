package com.sapient.client;



import com.sapient.services.Computer;
import com.sapient.services.Mobile;
import com.sapient.services.Product;

public class ProductClient {

	public static void main(String[] args) {
		Product [] arr = new Product[4];
		arr[0]= new Computer (1001,"acer laptop",35000,"4tb");
		arr[1]= new Computer (1002,"hp laptop",20000,"2tb");
		arr[2]= new Mobile (1003,"samsung",7000,"14mp");
		arr[3]= new Mobile (1004,"iphone",20000,"16.2mp");
		
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.printf("%10s%20s%10s%20s%20s\n","PID","PNAME","PRICE","CAM","HDD","RANGE","TYPE");
		System.out.println("--------------------------------------------------------------------------------------");
		
		for(Product prod: arr){
			prod.display();
			System.out.println("\n");
			
			
		}

	}

}
