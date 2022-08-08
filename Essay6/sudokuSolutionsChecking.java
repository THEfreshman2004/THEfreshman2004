package Essay6;
import java.util.Scanner;
public class sudokuSolutionsChecking {
	public static void main(String[] args) {
		//If the solution is correct there should be no duplicates in both rows and columns of the sudoku solution grid
				System.out.println("Enter the solution : ");
				int[][] solution_grid = read_solution();
			//Initializing the columns 2-dimensional array (flipped solution grid)
			    int[][] columns = new int[9][9];
			    for(int j = 0 ; j<9 ; j++) {
			    	for(int i = 0 ; i<9 ; i++) {
			    		columns[i][j] = solution_grid[j][i];
			    	}
			    }
			    for(int i = 0 ; i<9 ; i++) {
					System.out.print("{ ");
					for(int j = 0 ; j<9 ; j++) {
						System.out.print(columns[i][j] + " ");
					}
					System.out.print("}");
			    }
			    	System.out.println();
			//We need 81 correct numbers in the rows and 81 correct numbers in the columns    
				int correct_numbers_inColumn = 0;
				for(int i = 0 ; i<9 ; i++) {
					for(int j = 1 ; j<=9 ; j++) {
						if(!existenceOfDuplicate(j , columns[i]))
						correct_numbers_inColumn++;
					}
				}
				int correct_numbers_inRow = 0;
				for(int i = 0 ; i<9 ; i++) {
					for(int j = 1 ; j<=9 ; j++) {
						if(!existenceOfDuplicate(j , solution_grid[i]))
							correct_numbers_inRow++;
					}
				}
				System.out.println("Correct numbers in rows : " + correct_numbers_inRow);
				System.out.println("Correct numbers in columns : " + correct_numbers_inColumn);
				if(correct_numbers_inRow == 81 && correct_numbers_inColumn == 81)
					System.out.println("The solution is correct");
				else
					System.out.println("The solution isn't correct. Try again");
			}
			// The existence of the duplicates method
			public static boolean existenceOfDuplicate(int element , int[] array) {
				int length = array.length;
				boolean duplicate = false;
				int duplicate_count = 0;
				for(int i = 0 ; i<length ; i++) {
					if(element == array[i]) 
						duplicate_count++;
				}
				if(duplicate_count == 1) duplicate = false;
				else duplicate = true;
				return duplicate;
			}
			public static int[][] read_solution(){
				Scanner input = new Scanner(System.in);
				int[][] grid = new int[9][9];
				for(int i = 0 ; i<9 ; i++) {
					for(int j = 0 ; j<9 ; j++)
						grid[i][j] = input.nextInt();
				}
				return grid;
	}

}
