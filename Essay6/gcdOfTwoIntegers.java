package Essay6;

import java.util.Scanner;

public class gcdOfTwoIntegers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two integers to find their gcd (Press Enter keyword after each one)");
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		int i = 2;
		int gcd = 1;
		while (i<=Math.min(n2, n1)) {
			if (n1%i==0 && n2%i==0)
				 gcd = i;
			i++;
		}
		System.out.println("The gcd of " + n1 +" and "+ n2 +" is " + gcd);
	}

}
