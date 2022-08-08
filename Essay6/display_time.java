package Essay6;
import java.util.Scanner;

public class display_time  {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the amount of seconds :");
		int seconds = input.nextInt();
		int minutes = seconds/60 ;
		int remaining_seconds = seconds%60;
		System.out.println(seconds + " is " + minutes + " minutes and " + remaining_seconds + " seconds");
		

	}

}
