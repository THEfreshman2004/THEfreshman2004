package Essay6;

import java.util.Scanner;

public class numberOfPrimesDisplayed {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many prime numbers you want to dispaly");
		int boundary = input.nextInt();
		int count = 0;
		int n = 1;
		while (count<boundary && n>0) {
			if (isPrime(n)) {
				System.out.print(n + " ");
				count++;
			}
			n++;
		}
	
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
