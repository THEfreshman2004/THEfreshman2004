package Essay6;
import java.util.Arrays;
import java.util.Scanner;

public class numberOfEvensAndOdds {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the integers :");
		int[] array = new int[(int)Math.pow(2, 20)];
		int length = array.length;
		int count = 0;
		for(int i = 0 ; i<length ; i++) {
			array[i] = input.nextInt();
			count++;
			if(array[i] == 0) break;
		}
		int size = count;
		int[] list = new int[size];
		for(int i = 0 ; i<size ; i++)
			list[i] = array[i];
		int count_odd = 0;
		int count_even = 0;
		for(int i = 0 ; i<size-1 ; i++) {
			if(list[i] % 2 == 0) count_even++;
			else count_odd++;
		}
		System.out.println("The number of odd numbers is " + count_odd + "\nThe number of even numbers is " + count_even);
		
	}

}
