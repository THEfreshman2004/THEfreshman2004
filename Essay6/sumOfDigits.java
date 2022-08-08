package Essay6;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter an integer that you want to compute the sum of it's digits");
	    long n = input.nextLong();
	    String number = Long.toString(n);
	    System.out.println("The sum of the digits is " + sumDigits(number));
	}
	public static int sumDigits(String number) {
		int length = number.length();
		int i = 0;
		int sum = 0;
		while (i<length) {
			 sum = sum +Character.getNumericValue(number.charAt(i));
			 i++;
		}
		return sum;
	}

}
