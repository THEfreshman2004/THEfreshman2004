package Essay6;

public class displayingMersennePrimes {

	public static void main(String[] args) {
		int p = 1;
		System.out.println("p                     2^p - 1");
		System.out.println("------------------------------");
		while(p<31) {
			if(primeNumbersBeforeBoundary.isPrime(p) && primeNumbersBeforeBoundary.isPrime((int)((Math.pow(2, p))-1 ))) {
				System.out.println(p + "                     " + ((int)(Math.pow(2, p))-1 )) ;
			}
				p++;
			
		}
	}

}
