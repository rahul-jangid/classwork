package com.sapient.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sapient.exception.IdException;
import com.sapient.exception.NotfoundException;
import com.sapient.vo.Emp;

public class EmpMemDao implements IDao{
	
	public static Map<Integer, Emp> emap;
	
	static{
		emap = new HashMap<Integer,Emp>();
		emap.put(1001, new Emp(1001,"ram",45000,1,LocalDate.of(2014, 7, 21)));
		emap.put(1002, new Emp(1001,"tom",45000,1,LocalDate.of(2015, 8, 11)));
		emap.put(1003, new Emp(1001,"sam",45000,1,LocalDate.of(2017, 6, 23)));
	}

	@Override
	public List<Emp> viewEmployee() {
		List<Emp> lst = new ArrayList<Emp>();
		lst.addAll(emap.values());
		return lst;		
	}

	@Override
	public Emp viewEmployee(int eid) throws NotfoundException {
		if(emap.containsKey(eid))
			throw new NotfoundException("employee not found");
		Emp emp = emap.get(eid);
		return emp;
	}

	@Override
	public int addEmployee(Emp emp) throws IdException {
		if(emap.containsKey(emp.getEmpId()))
			throw new IdException("employee not found");
		emap.put(emp.getEmpId(), emp);
		return 1;
	}

	@Override
	public int removeEmployee(int eid) throws NotfoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateSalary(int eid, double sal) throws NotfoundException {
		// TODO Auto-generated method stub
		return 0;
	}

}
