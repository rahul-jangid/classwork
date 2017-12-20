package com.sapient.client;

import java.util.Scanner;

import com.sapient.services.Account;
import com.sapient.services.Savings;

public class AccountClient {
	private static Account [] arr = new Account[4];
	static{
		arr[0]=new Savings(1001,"ram",5000);
		arr[1]=new Savings(1002,"amit",25000);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String opt = null;
		int acctype= 0;
		double amt =0;
		do{
			System.out.println("enter acc type 0 -- savings, 1-- loan");
			acctype = scan.nextInt();
			if(acctype < 0 || acctype > 1){
				System.out.println("invalid type ");
			}
			else
			{
				System.out.println("enter amount to deposit");
				amt = scan.nextDouble();
				arr[acctype].deposit(amt);
				arr[acctype].display();
			}
			System.out.println("enter y to continue ");
		}while(opt.equals("y"));
		scan.close();

	}

}
