package com.BridgeIt.Oops;
/******************************************************************************************
* 	@purpose      :  To Know Inventory Data Management of Rice, Pulses and Wheats using Json
*  
*  @author       : NK.CHANNAVEERA
*  @version      : 1.0
*  @since        : 25-03-2019
******************************************************************************************/

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DataManagement
{
	public static void main(String[] args) 
	{
		// to give a path 
		final String path="/home/admin123/Documents/workourt/Java-Programs/src/com/BridgeIt/jsonFiles/inventory.json";
		// File class is an abstract representation of file and directory pathname.
		File file = new File(path);
		// jackson Object is created to use json
		ObjectMapper mapper =new ObjectMapper();
		
		try {
			JsonNode rootNode=mapper.readTree(file);
			//for Rice
			JsonNode inventory_Rice= rootNode.get("Rice");
			System.out.println("========RICE=========");
			for(JsonNode jsnode : inventory_Rice)
			{
				String name =jsnode.path("name").asText();
			    double price =jsnode.path("price").asDouble();
			    double weight=jsnode.path("weight").asDouble();
			    
			    System.out.println("Name:"+name+"\nPrice: "+price+"\nWeight: "+weight);
			    System.out.println("total: "+price*weight+" Rs"+"\n");
			}
			System.out.println("======================");
			//for pulese
			JsonNode inventory_Pulses=rootNode.get("Pulses");
			System.out.println("========Pulses========");
			for(JsonNode jsnode :inventory_Pulses)
			{
				String name=jsnode.path("name").asText();
				double price=jsnode.path("price").asDouble();
				double weight=jsnode.path("weight").asDouble();
				 System.out.println("Name:"+name+"\nPrice: "+price+"\nWeight: "+weight);
				 System.out.println("total: "+price*weight+" Rs"+"\n");
			}
			System.out.println("======================");
			//for wheat
			JsonNode inventery_Wheats=rootNode.get("Wheat");
			for(JsonNode jsnode : inventery_Wheats)
			{
				String name =jsnode.path("name").asText();
				double price =jsnode.path("price").asDouble();
				double weight=jsnode.path("weight").asDouble();
				System.out.println("Name:"+name+"\nPrice: "+price+"\nWeight: "+weight);
				System.out.println("total: "+price*weight+" Rs"+"\n");
				System.out.println("=======================");
				
			}
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	
	
}
