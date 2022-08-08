package Essay6;

public class numberOfOccurrences {

	public static void main(String[] args) {
		char randomCharacter = (char)('a' + (Math.random())*('z' - 'a' + 1));
	    char[] List = new char[100];
	    String[] counts = new String[26];//The array that contains the number of occurrences of the characters
	    int length = List.length;
	    for(int i = 0 ; i<length ; i++)
	    	List[i] = (char)('a' + (Math.random())*('z' - 'a' + 1));
	    for(int i = 0 , count = 1 ; i<length ; i++ , count++) {
	    	if(count % 20 == 0)
	    	   System.out.println(List[i]);
	    	else
	    		System.out.print(List[i] + " ");	
	    }
	    System.out.print("\n");
	    for(int i = 97 , count = 1 , j = 0 ; 'a'<=i && i<='z' && j<26 ; i++ , count++ , j++) {
	        counts[j] = Integer.toString(numberOfOccurences((char)(i) , List)) + (char)i;
	    	if(count % 10 == 0)
	         System.out.println(Integer.toString(numberOfOccurences((char)(i) , List)) + (char)i);
	    	else
	    		System.out.print(Integer.toString(numberOfOccurences((char)(i) , List)) + (char)i + " ");
	    }
	   
   }
	public static int numberOfOccurences(char a , char[] array) {
		int count = 0;
		int length = array.length;
		for(int i = 0 ; i<length ; i++) {
			if(a == array[i])
				count++;
		}
		return count;
	}

}
