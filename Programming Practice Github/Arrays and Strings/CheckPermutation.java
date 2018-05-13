import java.util.*;

public class CheckPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcd";
		String str2 = "cdbf";
		
		System.out.println(checkIfPermutation(str1, str2));

	}
	
	
	private static boolean checkIfPermutation(String str1, String str2){
		if(str1.length() != str2.length())
			return false;
		
		int[] charset = new int[128];
		for(int i=0; i<str1.length(); i++){
			int val = str1.charAt(i);
			charset[val]++;
		}
		
		for(int i=0; i<str2.length(); i++) {
			int val = str2.charAt(i);
			charset[val]--;
			if(charset[val] < 0)
				return false;
		}
		return true;
	}

}
