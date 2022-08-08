package Essay6;

import java.util.Scanner;

public class maxOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("You want to find the maximum of how many numbers ?");
		int length = input.nextInt();
		double[] Numbers = new double[length];
		System.out.println("Type these Numbers");
		for(int i = 0 ; i<length ; i++) 
			Numbers[i] = input.nextDouble();
		System.out.println("The maximum of the numbers you've just entered is " + Maximum(Numbers));
	}
	public static double Maximum(double[] array) {
	    double max = array[0];
		int length = array.length; 
		for(int i = 0 ; i<length ; i++) { 
			if(array[i]>max) max = array[i];
	   }
		return max;
	}

}
