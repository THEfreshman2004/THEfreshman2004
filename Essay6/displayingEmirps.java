package Essay6;

import java.util.Scanner;

public class displayingEmirps {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Emirps are primes whose inverses are also primes");
		System.out.println("How many Emirps you want to display ?");
		int Number_of_Emirps = input.nextInt();
		System.out.println("How many Emirps in one single line");
		int Numbers_per_line = input.nextInt();
		int n = 1;
		int count = 0;
		while(count<120 && n>0) {
			if(primeNumbersBeforeBoundary.isPrime(n) && primeNumbersBeforeBoundary.isPrime(reversing_Integers.reverse(n)) ) {
				count++;
				if(count % Numbers_per_line == 0)
				    System.out.println(n);
				else
					System.out.print(n + " ");
			}
			n++;
		}
	}

}
