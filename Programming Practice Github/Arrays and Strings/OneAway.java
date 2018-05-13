import java.util.*;

public class OneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "pab";
		String str2 = "pall";
		
		System.out.println(isOneAway(str1, str2));
	}
	
	private static boolean isOneAway(String str1, String str2) {
		if(Math.abs(str1.length() - str2.length()) > 1) return false;
		
		String longString = (str1.length() > str2.length())? str1: str2;
		String shortString = (str1.length() < str2.length()) ?  str1 : str2;

		int shortIndex = 0;
		int longIndex = 0; 
		boolean foundDifference = false;
		
		while(longIndex < longString.length() && shortIndex < shortString.length()) {
			
			if(longString.charAt(longIndex) != shortString.charAt(shortIndex)) {
				if(foundDifference)
					return false;
				foundDifference = true;
				if(longString.length() != shortString.length())
					longIndex++;
			}

			longIndex++;
			shortIndex++;
			
		}
		System.out.println(shortIndex);
		System.out.println(longIndex);;
		if(foundDifference && (longIndex != longString.length()-1)) return false;
		return true;
	}

}
