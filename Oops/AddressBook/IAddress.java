package com.BridgeIt.Oops.AddressBook;

import java.io.File;
import java.io.IOException;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public interface IAddress 
/**
* 	@purpose     :  To hold address path to save file read from //destination 
*  @author       Nk.channaveera
*  @version      : 1.0
*  @since        : 29-03-2019
*  
***/
{
	ObjectMapper objectmapper =new ObjectMapper();
	public static File getPathOfFile(String fileName, String fileExtension)
	{
		fileName = "/home/admin123/Documents/workourt/Java-Programs/src/com/BridgeIt/Oops/AddressBook/"
				+ fileName + fileExtension;
		
		File file = new File(fileName);
		
		return file;
	}
	public static void saveFile(File file)
	{
		List<Person> updatedList =FileSystem.getList();
		try {
			objectmapper.writerWithDefaultPrettyPrinter().writeValue(file, updatedList);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void readFile(File file)
	{
		try 
		{
			com.BridgeIt.Oops.AddressBook.FileSystem.setList(objectmapper.readValue(file, new TypeReference<List<Person>>() {}));
		} 
		catch (IOException e) 
		{
			System.out.println("\nFile Not Found!\n");
		}
	}
	
}

