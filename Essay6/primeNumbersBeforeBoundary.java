package Essay6;

import java.util.Scanner;

public class primeNumbersBeforeBoundary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the boundary for the prime numbers");
		int boundary = input.nextInt();
		int n = 1;
		int count = 0;
		while (n<boundary) {
			if (isPrime(n)) 
				count++;
			n++;
		}
		System.out.println("There are "+ count +" prime numbers less than " + boundary);
		}
		public static boolean isPrime(int n) {
			boolean Prime = true;
			int i = 2;
			while (i<n) {
				if (n % i == 0)
					Prime = false;
				i++;
			}
			switch(n) {
			case 0 : Prime = false;
			case 1 : Prime = false;
			}
			return Prime;
	}

}
