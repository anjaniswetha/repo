import java.util.*;

public class StringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabcccccaaa";
		
        System.out.println(compressedString(str));
	}
	
	
	private static String compressedString(String str) {
		int compressedCount = 0;
		StringBuilder compressedString = new StringBuilder();
		for(int i=0; i<str.length(); i++) {
			compressedCount++;
			if(i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)){
				compressedString.append(str.charAt(i));
				compressedString.append(compressedCount);
				compressedCount = 0;
			
			}
		}
		return (compressedString.length() < str.length())? compressedString.toString() : str;
		
	}

}
