package com.woc7005;

public  class BetweenTwoStrings {

	public static boolean are1and2LastCharacterTheSame(String str)
	{
		if(str.length() <= 1)
			return false;
		if(str.length() == 2)
			return true;
		
		String firstTwoChar = str.substring(0, 2);
		String lastTwoChar = str.substring(str.length()-2);
		
		return firstTwoChar.equals(lastTwoChar);
	}
}
