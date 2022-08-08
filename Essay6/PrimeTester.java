package Essay6;

import java.util.Scanner;

public class PrimeTester {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer to test if prime or not");
		int number = input.nextInt();
		boolean Prime = true;
		int i = 2;
		while (i<number) {
			if (number % i == 0)
				Prime = false;
			i++;
		}
		switch(number) {
		case 0 : Prime = false;
		case 1 : Prime = false;
		}
		if(!Prime)
			System.out.println(number + " isn't prime");
		else
			System.out.println(number + " is prime");

	}

}
