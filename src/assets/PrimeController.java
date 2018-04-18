package com.aggrid.crudapp.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class PrimeController {
	
	static List<String> list = new ArrayList<String>();
	
	static {
		
		list.add("Kiran");
		list.add("Jesus");
		list.add("Ramesh");
		list.add("Moses");
		list.add("Honey");
		list.add("Kranthi1");
		list.add("Kranthi2");
		list.add("Kranthi3");
		list.add("Kranthi4");
		list.add("Kranthi5");
		list.add("Kranthi6");
		list.add("Kranthi7");
		list.add("Kranthi8");
		list.add("Kranthi9");
		list.add("Kranthi10");
		list.add("kkkkkkk Kranthi1");
		list.add("kkk Kranthi2");
		list.add("K ranthi3");
		list.add("Kran thi4");
		list.add("Kranthi5");
		list.add("Krant hi6");
		list.add("Kr anthi7");
		list.add("Kr anthi8");
		list.add("Krant hi9");
		list.add("Kran thi10");
		list.add("kala123");
		list.add("kala444");
		list.add("kal222a");
		
	}
	
	public  List<String> filterList(String filterKey) {
		List<String> filteredList = new ArrayList<String>();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (String string : list) {
			 if(string.toLowerCase().startsWith(filterKey.toLowerCase()))
				 filteredList.add(string);
		}
		return filteredList;
	}
    public PrimeController() {
    }

    @RequestMapping("/filter/{key}")
    public List<String> getCountries(@PathVariable String key) {
        return filterList(key);
    }

}
