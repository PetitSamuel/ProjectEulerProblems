
public class PalindromicNumbers {

	public static void main(String[] args) {
		int largest = 0;
		int a = 0;
		int b = 0;
		for(int count = 100; count < 999; count ++)
		{
			for(int count2 = 100; count2 < 999; count2 ++)
			{
				int tmp = count * count2;
				if(tmp == reverseNumber(tmp))
				{
					if(tmp > largest)
					{
						largest = tmp;
						a = count;
						b = count2;
					}
				}
			}
		}
		System.out.println("The largest palindrome made from the product of two 3-digit numbers is : " + largest);
		System.out.println("It is made from the product of these two 3 digit numbers : "+ a + " and " + b);

	}
	
	public static int reverseNumber(int number)
	{
		int reversed = 0;
		int tmp = number;
		while(tmp > 0)
		{
			reversed = (reversed * 10) + (tmp % 10);
			tmp /= 10;
		}
		return reversed;
	}

}
