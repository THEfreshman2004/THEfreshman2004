package Essay6;
import java.util.Scanner;
public class eliminating_duplicates {
	public static void main(String[] args) {
		int[] array = new int[7];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 7 integers : ");
		int length = array.length;
		for(int i = 0 ; i<length ; i++) array[i] = input.nextInt();
		System.out.print("Distinct elements are : ");
		int size = 0;
		for(int i = 0 ; i<length ; i++) {
			int count = 0;
			for(int j = i ; j>=0 ; j--) {
				if(array[i] == array[j])
					count++;
			}
			if(count == 1) 
				System.out.print(array[i] + " ");
		}
	}
}
