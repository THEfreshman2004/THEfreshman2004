package Essay6;

import java.util.Scanner;

public class Displaying_twin_primes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the boundary of the twin primes");
		int boundary = input.nextInt();
		System.out.println("The twin primes less than " + boundary + " are :");
		int i = 1;
		while(i<boundary) {
			if(primeNumbersBeforeBoundary.isPrime(i) && primeNumbersBeforeBoundary.isPrime(i+2))
				System.out.print(("(" + i + ";" + (i+2) + ")") + " ");
			i++;
		}

	}

}
