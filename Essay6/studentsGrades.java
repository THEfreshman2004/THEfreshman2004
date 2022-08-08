package Essay6;
import java.util.Scanner;
public class studentsGrades {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char[][] studentsAnswers = new char[8][10];
		int rows = 8; int columns = 10;
		for(int i = 0 ; i<rows ; i++) {
			System.out.println("Enter the answers of student " + i);
			for(int j = 0 ; j<columns ; j++) {
				studentsAnswers[i][j] = input.next().charAt(0);
			}
		}
		System.out.println("The students' answers :");
		for(int i = 0 ; i<rows ; i++) {
			System.out.print("{ ");
			for(int j = 0 ; j<columns ; j++) {
				System.out.print(studentsAnswers[i][j] + " ");
			}
			System.out.print("}");
		}
		char[] key = {'D','B','D','C','C','D','A','E','A','D'};
		System.out.println();
		int[] nbr_incorrect_answers = new int[8];
		for(int i = 0 ; i<rows ; i++) {
			nbr_incorrect_answers[i] = misses(studentsAnswers[i],key);
			System.out.println("The grade of student " + i + " is " + (10-misses(studentsAnswers[i],key)));
		}	
	}
	public static int misses(char[] array1 , char[] array2) {
		int misses = 0;
		for(int i = 0 ; i<array1.length; i++) {
			if(array1[i] != array2[i]) misses++;
		}
		return misses;
	}
}
