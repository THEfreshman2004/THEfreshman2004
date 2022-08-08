package Essay6;
import java.util.Arrays;
import java.util.Scanner;
public class shuffling {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers you want to shuffle");
		int size = input.nextInt();
		System.out.println("Enter integers to shuffle");
		int[] array = new int[size];
		for(int i = 0 ; i<size ; i++)
			array[i] = input.nextInt();
		System.out.println(Arrays.toString(shufflingArrays(array)));
   }
	public static int[] shufflingArrays(int[] array) {
		int length = array.length;
		for(int i = 0 ; i<length ; i++) {
			int j = (int)(Math.random()*length);
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		return array;
	}
}
