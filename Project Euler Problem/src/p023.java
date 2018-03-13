public class p023 {
	public static void main(String[] args) {
		boolean[] isAbundant = new boolean[28124];
		for(int i = 1; i <= 28123; i++)
		{
			long sum = getSumDivisors(i);
			if(sum > i)
			{
				isAbundant[i] = true;	
			}
			else
			{
				isAbundant[i] = false;	
			}
		}
		
		int sum = 0;
		for (int i = 1; i <= 28123; i++) 
		{
			if (!isSumOf2(i, isAbundant))
				sum += i;
		}
		System.out.println(sum);

	}
	public static boolean isSumOf2(int number, boolean [] isAbundant)
	{
		 for (int i = 0; i <= number; i++) {
			 if (isAbundant[i] && isAbundant[number - i])
		 return true;
		 }
		  return false;
	}
	public static long getSumDivisors(long a)
	{
	    int maxD = (int)Math.sqrt(a);
	    long sum=1;
	    for(int i = 2; i <= maxD; i++)
	    {
	        if(a % i == 0)
	        {
	           sum += i;
	           long d = a/i;
	           if(d!=i)
	              sum+=d;
	        }
	    }
		return sum;
	}
}
