package Essay6;

import java.util.Scanner;

public class GuessingNumber {

	public static void main(String[] args) {
		int MagicalNumber = (int)(Math.random()*100);
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your guess");
		int guess = input.nextInt();
		while (guess != MagicalNumber) {
			if (guess<MagicalNumber)
				System.out.println("Your guess is too low");
			else 
				System.out.println("Your guess is too high");
			guess = input.nextInt();
		}
		System.out.println("Yes, the number is " + MagicalNumber);

	}

}
