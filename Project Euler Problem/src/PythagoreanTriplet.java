/*
 PROBLEM :
 A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

 */
public class PythagoreanTriplet {

	public static void main(String[] args) {	
		for(int c = 0; c < 998; c++)
		{
			for(int a = 0; a < c; a++)
			{
				for(int b = 0; b < c; b++)
				{
					if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))
					{
						if(a+b+c == 1000)
						{
							System.out.println(a*b*c);
						}
					}
				}
			}	
		}
	}
}
