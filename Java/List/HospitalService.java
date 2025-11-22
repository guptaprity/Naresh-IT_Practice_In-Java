package com.prity.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HospitalService 
{
	private List<Hospital> hospitalList=new ArrayList<>();
	public int addHospital(String name,List<String> treatments,String contactPerson,String contactNumber,String location)
	{
		Hospital h = new Hospital(name,treatments,contactPerson,contactNumber,location);
		hospitalList.add(h);
		return h.getHospitalCode();
	}
	public Map<Integer,String> getHospitals() {
		Map<Integer, String> map = new HashMap<>();
		for(Hospital h:hospitalList)
		{
			map.put(h.getHospitalCode(), h.getHospitalName());	
		}
		return map;	
	}

	public Hospital getHospitalDetails(int code)
	{
		for(Hospital h:hospitalList)
		{
			if(h.getHospitalCode()==code) {
				return h;
			}
		}
		return null;
		
	}
}
