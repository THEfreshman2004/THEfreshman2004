package Essay6;

import java.util.Scanner;

public class average_ofAarray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("How many numbers you want to test ?");
	    int size = input.nextInt();
	    System.out.println("Enter these numbers please");
	    double[] Numbers = new double[size];
	    for(int i = 0 ; i<size ; i++)
	    	Numbers[i] = input.nextDouble();
	    double average = Average(Numbers);
	    System.out.println("The average is " + average +". So the numbers above average are :");
	    for(int i = 0 ; i<size ; i++) {
	    	if(Numbers[i]>average)
	    		System.out.print(Numbers[i] + "  ");
	    }
	    
	    	
	}
	public static double Average(double[] array) {
		int length = array.length;
		double sum = 0;
		for(int i = 0 ; i<length ; i++) 
			sum = sum + array[i];
		double average = sum/length;
		return average;
		
	}

}
