package Essay6;

import java.util.Scanner;

public class mathPow_smaller_than_a {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter the exponent 'a' of the integer to find the biggest number that verifies n^a");
	    int a = input.nextInt();
	    System.out.println("Enter the number that you don't want n^a to surpass");
	    int limit = input.nextInt();
	    int n = 1 ;
	    while(n>0) {
	    	if (Math.pow(n, a)>limit) {
	    		System.out.println("The integer that verifies the condition is " +  (n-1));
	    		break;
	    	}
	    	n++;
	    }
	   System.out.println("NOTE THAT");
	   System.out.println(n-1 + "^" + a +" = "+Math.pow(n-1, a) );
	   System.out.println(n + "^" + a +" = "+Math.pow(n, a) );
	}

}
