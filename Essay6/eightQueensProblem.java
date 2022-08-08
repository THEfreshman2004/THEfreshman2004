package Essay6;

public class eightQueensProblem {

	public static void main(String[] args) {
		//Generating the queens array
				int[][] queens = new int[8][2];
				boolean queensValidity;
				boolean rowsValidity;
				boolean columnsValidity;
				boolean diagonalValidity;
			do {
				for(int i = 0 ; i<8 ; i++) {
					for(int j = 0 ; j<2 ; j++)
						queens[i][j] = (int)(Math.random()*8 + 1);
				}
			//Get the rows and columns arrays
				int[] rows = new int[8];
				int[] columns = new int[8];
				for(int i = 0 ; i<8 ; i++) {
					rows[i] = queens[i][0];
					columns[i] = queens[i][1];
				}
				rowsValidity = !duplicationTest(rows);
				columnsValidity = !duplicationTest(columns);
				diagonalValidity = !diagonalTest(queens);
				queensValidity = rowsValidity && columnsValidity && diagonalValidity;
				
				}while(!queensValidity);
			 
				if(queensValidity) {
					System.out.println("The winning combination of queens is");
					displayArray(queens);
				}
			}
			public static boolean duplicationTest(int[] array) {
				boolean duplication = false;
				int count = 0 ;
				int length = array.length;
				for(int i = 0 ; i<length ; i++) {
					for(int j = 0 ; j<length ; j++) {
						if(array[i] == array[j])
							count++;
					}
				}
				if(count != 8) duplication = true;
				return duplication;
			}
			public static boolean diagonals(int[] array1 , int[] array2) {
				boolean diagonals = false;
				int x1 = array1[0];
				int x2 = array2[0];
				int y1 = array1[1];
				int y2 = array2[1];
				if(Math.abs(x1-x2) == Math.abs(y1-y2)) diagonals = true;
				return diagonals;
			}
		    public static boolean diagonalTest(int[][] array) {
				int rows = array.length;
				int columns = array[0].length;
				boolean diagonalTest = true;
				int count = 0 ;
				for(int i = 0 ; i<rows ; i++) {
					for(int j = 0 ; j<rows ; j++) {
						if(diagonals(array[i] , array[j])) count++;
					}
				}
				if(count == 8) diagonalTest = false;
				return diagonalTest;
		    }	
		    public static void displayArray(int[][] array) {
		    	int row = array.length;
		    	int column = array[0].length;
		    	for(int i = 0 ; i<row ; i++) {
					System.out.print("{ ");
					for(int j = 0 ; j<column ; j++) {
						System.out.print(array[i][j] + " ");
					}
					System.out.print("}");
		    }
	}

}
