package Essay6;
import java.util.Scanner;
public class body_mass_index {

	public static void main(String[] args) {
		System.out.println("Hello");
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your height in inches");
		double height = input.nextDouble()*0.0254;
		System.out.println("Please enter your weight in pounds");
		double weight = input.nextDouble()*0.45359237;
		double BMI = weight/(height*height);
		System.out.println("Your BMI is " + BMI);
		if (BMI<18.5)
			System.out.println("You are underweight");
		else if(BMI<25)
			System.out.println("You are normal");
		else if(BMI<30)
			System.out.println("You are overweight");
		else 
			System.out.println("You are obese");
		   
		
	}

}
