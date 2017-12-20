package com.sapient.client;

import com.sapient.services.EmpUtil;
import com.sapient.services.Idao;

public class EmpClient {

	public static void main(String[] args) {
		Idao dao =EmpUtil.getDaoInstance();
		System.out.println(dao.viewEmployee());

	}

}
