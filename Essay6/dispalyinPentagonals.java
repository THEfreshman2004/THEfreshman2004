package Essay6;

import java.util.Scanner;

public class dispalyinPentagonals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many Pentagonal numbers you want to display");
		int numberOfPentagonals = input.nextInt();
		System.out.println("The first " + numberOfPentagonals+ " Pentagonal numbers");
		int count = 0;
		int i = 1;
		while (count<numberOfPentagonals && i>0) {
			System.out.printf("%7d",getPentagonalNumber(i));
			i++;
			count++;
		}	
	}
	public static int getPentagonalNumber(int n) {
		return (n*(3*n-1))/2;

	}

}
