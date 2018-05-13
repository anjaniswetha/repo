import java.util.*;

public class UniqueCharacterStringUsingArrays {
	public static void main(String[] args) {
		String str = "worldtes";
		System.out.println(isUniqueString(str));
		
		int i = str.charAt(0);
		System.out.println(i);
		
		System.out.println(Character.getNumericValue('w'));
		
	}
	
	public static boolean isUniqueString(String str) {
		
		if(str.length() > 128) return false;  //if the string exceeds ascii limit
		
		boolean charset[] = new boolean[128];
		for(int i=0; i<str.length();i++) {
			int val = str.charAt(i);
			if(charset[val]) 
				return false;
			charset[val] = true;
			
		}
		return true;
		
	}
	
}
