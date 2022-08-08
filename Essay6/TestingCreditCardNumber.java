package Essay6;

import java.util.Scanner;

public class TestingCreditCardNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a credit card as a long integer");
        long number = input.nextLong();
        String card = Long.toString(number);
        if (card.length()<13 || card.length()>16 && !isPrefix(card) ) {
        	System.out.println("Invalid input");
        	System.exit(0);
        }
        int sumOfTheDoubles = sumOfDoubleOfEvens(number);
        int sumOfTheOdds = sumOfOddNumbers(number);
        int Sum = sumOfTheDoubles + sumOfTheOdds;
        if(Sum % 10 == 0)
        	System.out.println("The credit card is valid");
        else
        	System.out.println("The credit card isn't valid");
     }
	public static boolean isPrefix(String card) {
		int i1 = Character.getNumericValue(card.charAt(0));
		int i2 = Character.getNumericValue(card.charAt(1));
		int i3 = Character.getNumericValue(card.charAt(2));
		if(i1 == 4 || i1 == 5 || i1 == 6 || (i2 == 3 && i3 == 7)) {
			return true;		
			}
		else 
			return false;
	}
	public static int sumOfDoubleOfEvens(long n) {
		String number = Long.toString(n);
	    int length = number.length();
	    int i = 1;
	    int sum = 0;
	    while(2*i<=length) {
	    	sum = sum + sumOfDigits.sumDigits(Integer.toString(2*Character.getNumericValue(number.charAt(length - 2*i))));
	    	i++;
	    }
        return sum;	
	}
	public static int sumOfOddNumbers(long n) {
		String name = Long.toString(n);
		int length = name.length();
		int i = 1;
		int sum = 0;
		while(2*i-1<=length) {
			sum = sum + Character.getNumericValue(name.charAt(length + 1 - 2*i));
			i++;
		}
		return sum;
	}

}
