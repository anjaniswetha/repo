import java.util.*;

public class MatrixRotationClockWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1, 2, 3, 4, 5, 6}, 
						  {7, 8, 9, 10, 11, 12},
						  {13, 14, 15, 16, 17, 18},
						  {19, 20, 21, 22, 23, 24},
						  {25, 26, 27, 28, 29, 30},
						  {31, 32, 33, 34, 35, 36}};
		
		rotateClockWise(matrix);
	}
	
	
	public static boolean rotateClockWise(int[][] matrix) {
		if(matrix.length != matrix[0].length) return false;
		int n = matrix.length;
		
		
		//Iterate through layers starting from the top
		
		for(int layer = 0; layer < n/2; layer ++) {   // We will have only n/2 layers because at each level we will be covering up 2 rows.
			int first = layer;
			int last = n-1-layer;
			
			for(int i=first; i<last; i++) {
				int offset = i-layer;
				
				int temp = matrix[first][i];
				matrix[first][i] = matrix[last-offset][first];
				matrix[last-offset][first] = matrix[last][last-offset];
				matrix[last][last-offset] = matrix[i][last];
				matrix[i][last] = temp;

			}
		}
		printMatrix(matrix);
		return true;
		
	}
	
	
	private static void printMatrix(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
	

}
