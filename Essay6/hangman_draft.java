package Essay6;
import java.util.Scanner;
public class hangman_draft {
	public static void main(String[] args) {
		//Get a random word
				String[] words = {"best","friend","good"};
				int random_index = (int)(Math.random()*3);
				String random_word = words[random_index];
			//////////////////////
				//Generating the stars array in accordance with the random word
				int size = random_word.length();
				char[] stars = new char[size];
				for(int i = 0 ; i<size ; i++) stars[i] = '*';
			//////////////////////	
			//Generating the characters array 
				char[] characters = new char[size];
				Scanner input = new Scanner(System.in);
				for(int i = 0 ; i<size ; i++) characters[i] = random_word.charAt(i);
			/////////////////////	
				while(stars != characters) {
				    System.out.println("(Guess) Enter a letter in word ");    
				    char letter = input.next().charAt(0);
				    if(!existenceOfInput(letter , characters)) {
				    	System.out.println("Try again");
				    	System.out.println();
				    }
				    else {
				    	int index = getIndex(letter , characters);
				 		   char temp = stars[index];
				 		   stars[index] = letter;
				 		   letter = temp;
				 		  for(int i = 0 ; i<size ; i++) System.out.print(stars[i]);		
				 		  System.out.println();
				 		 }
				    }
				}
			public static int getIndex(char element , char[] array) {
				int count = 0;
				for(int i = 0 ; i<array.length ; i++) 
					if(array[i] == element) {
						count = i;
						break;
					}
				return count ;
			}
			
			public static boolean existenceOfInput(char element , char[] array) {
				boolean existence = true;
				for(int i = 0 ; i<array.length ; i++) {
					if(element == array[i]) {
						existence = true;
						break;
					}
					else existence = false;
				}
				return existence;
			}
	

}
