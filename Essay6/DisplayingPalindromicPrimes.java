package Essay6;

import java.util.Scanner;

public class DisplayingPalindromicPrimes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many Palindromic Primes you want to display ?");
		int Number_of_primes = input.nextInt();
		System.out.println("How many numbers per line ?");
		int Numbers_per_line = input.nextInt();
		int count = 1;
		int n = 1;
		while(count<=Number_of_primes && n>0) {
			if(reversing_Integers.isPalindrome(n) && primeNumbersBeforeBoundary.isPrime(n)) {
				if (count % Numbers_per_line == 0)
					System.out.println(n);
				else
					System.out.print(n + " ");
				count++;
			}
			n++;
		}

	}

}
