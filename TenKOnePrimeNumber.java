
public class TenKOnePrimeNumber {

	public static void main(String[] args) {
		int primeCount = 0;
		int count = 1;
		while(primeCount < 10001)
		{
			count++;
			if(isPrime(count))
			{
				primeCount++;;
			}
		}
		System.out.println(count);
	}
	public static boolean isPrime(int number)
	{
		for(int i = 2; i < number -1 ; i++)
		{
			if(number % i == 0)
			{
				return false;

			}
		}
		return true;
	}

}
