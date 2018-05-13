import java.util.*;

public class StringRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "waterbottle";
		String s2 = "erbottlewet";
		
		System.out.println(checkIfSubString(s1, s2));
	}
	
	public static boolean checkIfSubString(String s1, String s2) {
		if( s1.length() > 0 && s1.length() != s2.length()) return false;
		
		String s1s1 = s1+s1;
		
		 return isSubString(s1s1, s2);
			
	}
	
	
	public static boolean isSubString(String str1, String str2) {
		return str1.toLowerCase().contains(str2.toLowerCase());
	}

}
