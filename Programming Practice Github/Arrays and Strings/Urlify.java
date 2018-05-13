import java.util.*;

public class Urlify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Mr John Smithn    ";
		int trueLength = 13;
		stringUrlify(str.toCharArray(), trueLength);
		
	}
	
	
	private static void stringUrlify(char[] charset, int trueLength) {
		int spaceCount = 0;
		
		for(int i=0; i<trueLength-1; i++) {
			if(charset[i] == ' '){
				spaceCount++;
			}
		}
		
	  int index = (trueLength) + spaceCount*2;
	  
	  for(int i=trueLength-1; i>0; i--) {
		  if(charset[i] == ' '){
			  charset[index-1] = '0';
			  charset[index-2] = '2';
			  charset[index-3] = '%';
			  index = index - 3;
		  }else{
			  charset[index - 1] = charset[i];
			  index = index - 1;
		  }
	  }
	
		System.out.println(charset);
	}

}
