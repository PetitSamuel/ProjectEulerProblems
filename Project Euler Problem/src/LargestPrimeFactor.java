
public class LargestPrimeFactor {

	public static void main(String[] args) {
	    long x =600851475143L;
	    long prime = 0L;
	    for(long count = 2L; count < x; count++)
	    {
	    	if(x%count == 0)
	    	{
	    		if(isPrimeNumber(count))
	    		{
	    			prime = count;
	    		    System.out.println(prime);
	    		}
	    	}
	    }
	    System.out.println(prime);
	}
	public static boolean isPrimeNumber(long number)
	{
		for(long i = 2L; i < number -1 ; i++)
		{
			if(number % i == 0)
			{
				return false;

			}
		}
		return true;
	}

}
