public class p021 {

	public static void main(String[] args) {
		long sum = 0L;
		for(int i = 1; i < 10000; i++)
		{
			if(isAmicableNumber(i))
			{
				sum += i;
			}
		}
		System.out.println(sum);
	}
	public static boolean isAmicableNumber(int number)
	{
		int a = getSumDivisors(number);
		return a != number && getSumDivisors(a) == number;
	}
	public static int getSumDivisors(int a)
	{
	    int maxD = (int)Math.sqrt(a);
	    int sum=1;
	    for(int i = 2; i <= maxD; i++)
	    {
	        if(a % i == 0)
	        {
	           sum += i;
	           int d = a/i;
	           if(d!=i)
	              sum+=d;
	        }
	    }
		return sum;
	}

}
