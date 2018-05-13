import java.util.*;

public class UniqueCharacterStringUsingBits {
	public static void main(String[] args) {
		String str = "Worldl";
		
		System.out.println(isUniqueCharsByBits(str.toLowerCase()));
	}
	
	
	public static boolean isUniqueCharsByBits(String str) {
		int checker = 0;
		
		for(int i= 0; i<str.length(); i++) {
			int val = str.charAt(i)-'a';
			if((checker & (1 << val)) > 0)   // letft shift int 1 by the val and do & operation to find if checker already has 1
				return false; 
			
			checker  = checker | 1 << val;  // if not make the bit at index val 1 by doing OR operation with checker
		}
		return true;
	}
}
