package Essay6;

import java.util.Scanner;

public class sentinel_controlled_loop {

	public static void main(String[] args) {
		System.out.println("Keep in mind, the input ends if it's 0");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integers you want to add (press Enter keyword after each input)");
		int sum = 0;
		int data = input.nextInt();
		while (data != 0) {
			sum += data;
			data = input.nextInt();
		}
		
		System.out.println("The sum of these numbers is " + sum);
	}

}
