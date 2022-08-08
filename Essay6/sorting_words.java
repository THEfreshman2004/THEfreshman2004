package Essay6;
import java.util.Scanner;
public class sorting_words {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a word to sort : ");
		String word = input.nextLine();
		int size = word.length();
		char[] array = new char[size];
		for(int i = 0 ; i<size ; i++) 
			array[i] = word.charAt(i);
		for(int i = 0 ; i<size ; i++) {
			char min = smallest(array,i);
			array = swaped(array[i] , min , array);
		}
		for(int i = 0 ; i<size ; i++)
		  System.out.print(array[i]);
	 }
	public static char smallest(char[] array , int i) {
		int length = array.length;
		char min = array[i];
		while(i<length) {
			if(array[i]<min) min = array[i];
			i++;
		}
		return min;
	}
	public static int getIndex(char element , char[] sums) {
		int count = 0;
		for(int i = 0 ; i<sums.length ; i++) 
			if(sums[i] == element) {
				count = i;
				break;
			}
		return count ;
	}
	public static char[] swaped(char element1 , char element2 , char[] array) {
		int index1 = getIndex(element1 , array);
		int index2 = getIndex(element2 , array);
		char temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		return array;
	}
}
