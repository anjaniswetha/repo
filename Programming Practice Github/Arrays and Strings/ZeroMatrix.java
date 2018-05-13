import java.util.*;

public class ZeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9, 10, 0, 12}};
       
       setZeroMatrix(matrix);
	}
	
	private static void setZeroMatrix(int[][] matrix) {
		boolean isFirstRowZero = false;
		boolean isFirstColumnZero = false;
		
		int rowLength = matrix.length;
		int colLength = matrix[0].length;
		System.out.println(rowLength);
		System.out.println(colLength);
		
		//iterate through rows and see if there are zeroes in first column
		for(int i = 0; i < rowLength; i++){
			if(matrix[i][0] == 0) {
				isFirstColumnZero = true;
				break;
			}

		}
		
		//Iterate through columns and see if first row has any zeroes
		for(int i=0; i<colLength; i++) {
			if(matrix[0][i] == 0) {
				isFirstRowZero = true;
				break;
			}
		}
		
		//Now iterate through rest of the matrix and see if they have any zeroes
		for(int i=1; i < matrix.length; i++) {
			for(int j=1; j<matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		if(isFirstRowZero) {
				nullifyRow(matrix, 0);
		}
		
		if(isFirstColumnZero) {
			nullifyColumn(matrix, 0);
		}
		
		//nullify Columns based on values in first row
		
		for(int i=0; i<matrix[0].length ; i++) {
			if(matrix[0][i] == 0) 
				nullifyColumn(matrix, i);
		}
		
		for(int i=0; i<matrix.length; i++) {
			if(matrix[i][0] == 0)
				nullifyRow(matrix, i);
		}
				
		printMatrix(matrix);
	}
	private static void printMatrix(int[][] matrix) {
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
	public static void nullifyRow(int[][] matrix, int index) {
		for(int i=0; i<matrix[0].length; i++) {
			matrix[index][i] = 0;
		}
	}
	
	public static void nullifyColumn(int[][] matrix, int index) {
		for(int i=0; i<matrix.length; i++) {
			matrix[i][index] = 0;
		}
	}
}
