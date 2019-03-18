package com.BridgeIt.DataStructres;

import java.io.PrintWriter;

import javax.swing.plaf.synth.SynthScrollBarUI;

import com.BridgeIt.util.Utility;

public class UnOdrderList 
{
	public static void main(String[] args) throws Exception
	{
		String outPut;
		String path ="/home/admin123/Documents/StringFile.txt";
		LinkedList<String> linkedList= new LinkedList<String>();
		PrintWriter printWriter = new PrintWriter("StringFile.txt");
		String[] word=Utility.fileReadString(path);
		for( int i=0;i<word.length;i++)
		{
			linkedList.add(word[i]);
		}
		linkedList.display();
		System.out.println("Enter element to search from  file ");
		String searchElement= Utility.getStringName();
		if(linkedList.search(searchElement)== true)
		{
			System.out.println("Element found form file ");
			System.out.println("Removing Element from  file");
			linkedList.delete(searchElement);
			linkedList.display();
			outPut=linkedList.getString();
			printWriter.write(outPut);			
		}
		else
		{
			System.out.println("Oops Element not Find form file ");
			System.out.println("Adding Element to file ");
			linkedList.add(searchElement);
			linkedList.display();
			outPut=linkedList.getString();
			printWriter.write(outPut);
		}
		
		printWriter.flush();
		printWriter.close();
		
		
		
	}

}
