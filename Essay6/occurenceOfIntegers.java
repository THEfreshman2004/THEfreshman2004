package Essay6;
import java.util.Arrays;
import java.util.Scanner;

public class occurenceOfIntegers {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the integers between 1 and 50 : ");
			int[] array = new int[(int)Math.pow(2, 20)];
			int length = array.length;
			int count = 0 ;
			for(int i = 0 ; i<length ; i++) {
				array[i] = input.nextInt();
				count++;
				if(array[i] == 0) break;
			}
			int size = count ;
			int[] list = new int[size];
			for(int i = 0 ; i<size ; i++) {
				list[i] = array[i];
			}
			for(int i = 0 ; i<size-1 ; i++) 
				if(occurence(array[i] , array) != 1)
				    System.out.println(array[i] + " occures " + occurence(array[i] , array) + " times");
				else
					System.out.println(array[i] + " occures " + occurence(array[i] , array) + " time");
	    }
		public static int occurence(int element , int[] array) {
			int count = 0 ;
			int length = array.length;
			for(int i = 0 ; i<length ; i++) {
				if(element == array[i]) count++;
			}
			return count ;
		}
	}


