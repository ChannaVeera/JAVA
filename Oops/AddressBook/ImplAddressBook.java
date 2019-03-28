package com.BridgeIt.Oops.AddressBook;

import java.io.File;

import java.util.List;
import java.util.*;

public class ImplAddressBook implements IAddress
{

	Scanner sc=new Scanner(System.in);
	Scanner sc1=new Scanner(System.in);
	private List<Person> newList = new ArrayList<Person>();
	FileSystem fileSystem= new FileSystem();
	private static File file;

	private static String fileName;
	
	public ImplAddressBook() {}
	
	public List<Person> getPersonList()
	{
		return newList;
	}

	public void setPersonList(List<Person> personList) 
	{
		this.newList = personList;
	}

	public File getFile() 
	{
		return file;
	}

	public void setFile(File file)
	{
		AddressBook.file = file;
	}
	public int searchPersonbyFirstName(String keyFName)
	{
		int index = -1;
		for (int i = 0; i < fileSystem.getList().size(); i++ )
		{
			String personFirstName = fileSystem.getList().get(i).getFirstName();
			if(keyFName.equals(personFirstName))
			{
				index = i;
				break;
			}
		}

		return index;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		ImplAddressBook.fileName = fileName;
	}
}

	


