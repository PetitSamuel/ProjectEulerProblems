/*
 Problem 10 
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */
public class SumOfPrimes {
	public static final int PRIMES_BELOW = 2000000;
	public static void main(String[] args) {
 // solution uses Sieve of Eratosthenes algorithm for prime numbers
		boolean prime[] = new boolean[PRIMES_BELOW+1];
        long sum = 0L;
        for(int i=2;i<PRIMES_BELOW;i++)
        {
            prime[i] = true;
        }
        for(int p = 2; p*p <=PRIMES_BELOW; p++)
        {
            if(prime[p] == true)
            {
                for(int i = p*2; i <= PRIMES_BELOW; i += p)
                    prime[i] = false;
            }
        }    
        for(int a = 2; a < PRIMES_BELOW; a++)
        {
        	if(prime[a])
        	{
        		sum = sum + a;
        	}
        }
        System.out.println(sum);
	}
}
