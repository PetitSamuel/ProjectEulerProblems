import java.math.BigInteger;

public class SquarePossibilities {
	public static final long SQUARRE_DIMENSION = 20;
	public static void main(String[] args) {
//using a binomial law, vector (2n) = 2n! / n!(2n-n)! = 2n!/ (n!)^2
//								(n)   
// where n = 20, 

		BigInteger result = BigInteger.ONE;
		BigInteger div = BigInteger.ONE;
		for (int i=1; i<=40; i++) 
		{
			result = result.multiply(BigInteger.valueOf(i));
			if(i <= 20)
			{
				div = div.multiply(BigInteger.valueOf(i));
			}
		 }
		div = div.multiply(div);
		result = result.divide(div);
		System.out.println(result);
	}
}
	