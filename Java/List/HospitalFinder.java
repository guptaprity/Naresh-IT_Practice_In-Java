package com.prity.hashmap;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;

public class HospitalFinder {

	public static void main(String[] args) {
		HospitalService service = new HospitalService();
		int code1 = service.addHospital(
                "YASHODA",
                Arrays.asList("Cardiac", "ENT", "Ortho", "Pediatric", "Gastro"),
                "MATHEWS",
                "9848222222",
                "Sec"
        );

        int code2 = service.addHospital(
                "APOLLO",
                Arrays.asList("Neuro", "Ortho", "Cardiac"),
                "RAKESH",
                "9988776655",
                "Hyd"
        );

        int code3 = service.addHospital(
                "KIMS",
                Arrays.asList("Dermatology", "Gynecology"),
                "SUNIL",
                "9900112233",
                "Vizag"
        );
        
        System.out.println("Available Hospitals:");
        for(Entry<Integer, String> entry :        service.getHospitals().entrySet()) {
        	System.out.println(entry.getKey()+" :" +entry.getValue());
        }
        System.out.println("\nDetails of Hospital with code " + code1 + ":");
        System.out.println(service.getHospitalDetails(code1));
        

	}

}
