package com.epam.tddjunit;

public class RemoveA {

	public String removeA(String str) {
		if(str.length() == 0) {
			return "";
		}
		char a = str.charAt(0);
		char b = str.charAt(1);
		String res = "";
		String rem = str.substring(2);
		if(a == 'A' && b == 'A') res = rem;
		else if(a == 'A') res = b+rem;
		else if(b == 'A') res = a+rem; 
		else res = str;
		return res;
	}

}
