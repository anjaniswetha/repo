
import java.util.*;


public class MatrixRotationAntiClockWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1, 2, 3, 4, 5, 6}, 
				  {7, 8, 9, 10, 11, 12},
				  {13, 14, 15, 16, 17, 18},
				  {19, 20, 21, 22, 23, 24},
				  {25, 26, 27, 28, 29, 30},
				  {31, 32, 33, 34, 35, 36}};

		rotateAntiClockWise(matrix);
	}	
	
	
	public static boolean rotateAntiClockWise(int[][] matrix) {
		if(matrix.length != matrix[0].length) return false;
		
		int n = matrix.length;
		
		for(int layer = 0; layer < n/2; layer++) {
			int first = layer;
			int last = n-1-layer;
			
				for(int i=first; i<last; i++) {
				
					int offset = i-layer;
					//save bottom
					int temp = matrix[last][i];
					
					//save left to bottom
					
					matrix[last][i] = matrix[i][first];
					
					//save top to left
					
					matrix[i][first] = matrix[first][last-offset];
					
					//save right to top
					
					matrix[first][last-offset] = matrix[last-offset][last];
					
					//save temp to right
					
					matrix[last-offset][last] = temp;
					
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
