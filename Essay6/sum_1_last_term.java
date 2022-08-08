package Essay6;

import java.util.Scanner;

public class sum_1_last_term {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the last term of the sum");
		int LastTerm = input.nextInt();
		int i = 1;
		int sum = 0;
		while (i<=LastTerm) {
			sum = sum + i;
			i++;
		}
		System.out.println("The sum from 1 to " + LastTerm + " is equal to " + sum);

	}

}
