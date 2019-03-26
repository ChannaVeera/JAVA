package com.BridgeIt.Oops.commercialDataProcessing;

import java.io.File;
import java.io.IOException;
import java.util.List;



import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class StockUtility
{
	static ObjectMapper objectmapper= new ObjectMapper(); 
	public static void addAccount(String fileName)
	{
		fileName = ""+ fileName;
		try {
			List<Customer> customerList = objectmapper.readValue(new File(fileName), new TypeReference<List<Customer>>() {
			});
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
