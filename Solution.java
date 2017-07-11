
public class Solution {

	public static void main(String[] args) {

	int numPrimes = 0;
	int i = 1;
	int n = 0; //Insert nth prime you want to find
	
	while(numPrimes < n + 1) {
		if(isPrime(i)) {
			numPrimes++;
			if(numPrimes == n) {
				System.out.println(i);
			}
		}
		i++;
		
	}
		
	}
	
	public static boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}

}
