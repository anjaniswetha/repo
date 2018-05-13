import java.util.*;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String palindromeStr = "Tact Cob";
		System.out.println(isPalindromePermutation(palindromeStr));
	}
	
	public static boolean isPalindromePermutation(String str) {
		int[] charset = new int[(Character.getNumericValue('z') - Character.getNumericValue('a') )+ 1];
		int oddCharCount = 0 ;
		for(int i = 0; i < str.length(); i++) {
			int value = getCharNumber(str.charAt(i));	
			if(value != -1) {
				charset[value]++;
				if(charset[value] % 2 > 0 ) {
					oddCharCount++; 
				}else{
					oddCharCount--;
				}
			}
		}
		
		return oddCharCount <=1;
		
	}
	
	
	private static int getCharNumber(Character ch) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int value = Character.getNumericValue(ch);
		
		if(value >= a && value <=  z) {
			return value - a; //The array we took is just length of 26, so we need to get offset in order to keep it in charset;
		}else
			return -1;
		
	}

}
