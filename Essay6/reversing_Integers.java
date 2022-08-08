package Essay6;

import java.util.Scanner;

public class reversing_Integers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer that you want to reverse");
		int n = input.nextInt();
		System.out.println("The reverse of you integer is " + reverse(n));
		if (isPalindrome(n))
		    System.out.println("So the integer you entered is a Palindrome");
		else
			System.out.println("The integer you entered isn't a Palindrome");
	}
	public static int reverse(int n) {
		String number = Integer.toString(n);
		int length = number.length();
		int i = 1;
		String reversed = "";
		while(i<=length) {
			reversed = reversed + number.charAt(length-i);
			i++;
		}
		return Integer.parseInt(reversed);
		
	}
	public static boolean isPalindrome(int n) {
		if (reverse(n) == n)
			return true;
		else
			return false;
			
	}
	}


