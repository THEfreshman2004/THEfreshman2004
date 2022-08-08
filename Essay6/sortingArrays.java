package Essay6;
import java.util.Scanner;
public class sortingArrays {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many numbers you want to sort ?");
		int size = input.nextInt();
		double[] array = new double[size];
		System.out.println("Enter these numbers");
		for(int i = 0 ; i<size ; i++) 
			array[i] = input.nextDouble();
		for(int i = 0 ; i<size ; i++) {
			double min = smallest(array,i);
			array = swaped(array[i] , min , array);
		}
		System.out.println(java.util.Arrays.toString(array));
	 }
	public static double smallest(double[] array , int i) {
		int length = array.length;
		double min = array[i];
		while(i<length) {
			if(array[i]<min) min = array[i];
			i++;
		}
		return min;
	}
	public static int getIndex(double element , double[] sums) {
		int count = 0;
		for(int i = 0 ; i<sums.length ; i++) 
			if(sums[i] == element) {
				count = i;
				break;
			}
		return count ;
	}
	public static double[] swaped(double element1 , double element2 , double[] array) {
		int index1 = getIndex(element1 , array);
		int index2 = getIndex(element2 , array);
		double temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
		return array;
	}
}
