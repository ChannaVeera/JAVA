package com.BridgeIt.Oops;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

import com.BridgeIt.util.Utility;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RegularExpression 
{
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		Scanner scanner1= new Scanner(System.in);
		final String path ="/home/admin123/Documents/workourt/Java-Programs/src/com/BridgeIt/jsonFiles/regexpression.json";
		File file=new File(path);
		ObjectMapper mapper =new ObjectMapper();
		try {
			JsonNode jsonnode =mapper.readTree(file);
			JsonNode rootNode=mapper.readTree(file);
			System.out.println(""+rootNode);
			String values="regular";
			System.out.println(""+values);
			JsonNode regular=rootNode.path(values);
			String str=regular.asText();
			System.out.println(""+str);
			System.out.println("Enter your name");
			String name =scanner.nextLine();
			if(Pattern.matches("[a-zA-Z]+", name))
			{
				str=str.replaceAll("<<name>>", name);
			}
			System.out.println("Enter FullName..");
			String  fullName= scanner.nextLine();
			if(Pattern.matches("[a-zA-Z.]+",fullName ))
			{
				str=str.replaceAll( "<<full name>>", fullName);
			}
			System.out.println("Enter your phoneNumber  ");
			String phoneNumber =scanner1.nextLine();
			if(Pattern.matches("[0-9]+",phoneNumber))
			{
				str=str.replaceAll("x{10}",phoneNumber);
			}
			
			Date currentDate = new Date();								//reading current date 
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	
	        String date = sdf.format(currentDate);
	        str=str.replaceAll("dd/mm/yyyy", date);
	        System.out.println(""+str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
