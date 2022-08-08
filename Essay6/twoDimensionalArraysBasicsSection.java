package Essay6;

import java.util.Scanner;

public class twoDimensionalArraysBasicsSection {

	public static void main(String[] args) {
		//Initializing the 2-dimensional array with random values from 1 to 99
				Scanner input = new Scanner(System.in);
				System.out.println("Enter the array numbers");
				int[][] array = new int[5][3];
				int row = 5 ; int column = 3 ;
				for(int i = 0 ; i<row ; i++) {
					for(int j = 0 ; j<column ; j++) {
						array[i][j] = (int)(Math.random()*100);
					}
				}
				//////////////////////////////////////////
			    //Displaying the array
				for(int i = 0 ; i<row ; i++) {
					System.out.print("{ ");
					for(int j = 0 ; j<column ; j++) {
						System.out.print(array[i][j] + " ");
					}
					System.out.print("}");
					////////////////
				}
				System.out.println();
				//The row with the greatest sum
				int[] sums = new int[row];
				for(int i = 0 ; i<row ; i++) {
					int sum_of_row = 0;
					for(int j = 0 ; j<column ; j++) {
						sum_of_row = sum_of_row + array[i][j];
					}
					System.out.println("The sum of row " + (i+1) + " is " + sum_of_row);
					sums[i] = sum_of_row;
				}
				int max = sums[0];
				for(int i = 0 ; i<row ; i++)
					if(sums[i]>max) max = sums[i];
				System.out.println("The row with the greatest sum is " + getIndex(max, sums));
				////////////////////////////////////
				//Random shuffling and displaying the shuffled array
				for(int i = 0 ; i<row ; i++) {
					for(int j = 0 ; j<column ; j++) {
						int random_row = (int)(Math.random()*row);
						int random_column = (int)(Math.random()*column);
						int temp = array[i][j];
						array[i][j] = array[random_row][random_column];
						array[random_row][random_column] = temp;
					  }
				  }
				System.out.println("The shuffled array :");
				for(int i = 0 ; i<row ; i++) {
					System.out.print("{ ");
					for(int j = 0 ; j<column ; j++) {
						System.out.print(array[i][j] + " ");
					}
					System.out.print("}");
				}
					
			}
			public static int getIndex(int element , int[] array) {
				int count = 0 ;
				for(int i = 0 ; i<array.length ; i++) {
					if(element == array[i]) {
						count = i;
						break;
					}
				}
				return (count+1);
			}
			
	}


