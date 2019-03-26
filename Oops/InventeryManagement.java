package com.BridgeIt.Oops;

import java.io.File;
import java.io.IOException;

import com.BridgeIt.util.Utility;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InventeryManagement
{
	public static void main(String[] args) 
	{
		int choose;
		final String path="/home/admin123/Documents/workourt/Java-Programs/src/com/BridgeIt/jsonFiles/inventory.json";
		File file= new File(path);
		ObjectMapper mapper =new ObjectMapper();
		try {
			JsonNode rootNode =mapper.readTree(file);
			do {
				System.out.println("Choose 1.Rice/t 2.Pulese /t 3.wheat");
				choose=Utility.getnumber();

			}
			while(choose<0||choose>4);
			String inventoryproduct = "";

			switch (choose) {
			case 1:
				inventoryproduct = "Rice";
				break;
			case 2:
				inventoryproduct = "Pulses";
				break;
			case 3:
				inventoryproduct = "Wheat";
				break;
			default:
				System.out.println("Invalid Input");

			}
			JsonNode inventery =rootNode.get(inventoryproduct);
			for(JsonNode node : inventery)
			{
				String name =node.path("name").asText();
				double price=node.path("price").asDouble();
				double weight= node.path("weight").asDouble();

				System.out.println("Name:" + name + "\nPrice: " + price + "\nWeight: " + weight);
				System.out.println("total: " + price * weight + " Rs" + "\n");
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
