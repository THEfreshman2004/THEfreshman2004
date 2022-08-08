package Essay6;

import java.util.Scanner;

public class displayingPrimes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the final integer");
		int num = input.nextInt();
		int i = num - 1;
		while(i>1) {
			int j = 2;
			boolean Prime = true;
			while(j<i) {
				if(i%j==0)
					Prime = false;
			j++;
			}
			if (Prime)
			    System.out.print(i + " ");
			i--;
		}
	}

}
