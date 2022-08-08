package Essay6;
import java.util.Scanner;
public class addition_quiz {

	public static void main(String[] args) {
            System.out.println("Hello");
            int a = (int)((Math.random())*100);
            int b = (int)((Math.random())*100);
            Scanner input = new Scanner(System.in);
            System.out.println("what is the addition of " + a + " and " + b + " ?");
            int answer = input.nextInt();
            while(answer != a+b) {
            	System.out.println("TRY AGAIN");
            	answer = input.nextInt();
            }
            System.out.println("YOU GODDAMN RIGHT");
	}

}
