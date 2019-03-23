package com.BridgeIt.FunctionalPrograms;
/******************************************************************************************
 * 	@purpose      :  To Replace String With another String  
 *  @author       : NK.CHANNAVEERA
 *  @version      : 1.0
 ******************************************************************************************/

import com.BridgeIt.util.Utility;

public class StringReplace {
	public static void main(String[] args) {
		String stringTemplate = "Hello <<UserName>>, How are you?";
		String replace = Utility.getStringName();
		String replaceString;
		if (replace.length() >= 3) {
			replaceString = stringTemplate.replace("<<UserName>>", replace);
			System.out.println(replaceString);

		}

	}

}
