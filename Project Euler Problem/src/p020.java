import java.math.BigInteger;

public class p020 {

	public static void main(String[] args) {
		
		BigInteger factorial = BigInteger.ONE;
		for(int i = 1; i <= 100; i++)
		{
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		String output = factorial.toString();
		int result = 0;
		for(int index = 0; index < output.length(); index++)
		{
            result += Character.getNumericValue(output.charAt(index));
		}
		System.out.println(result);
	}

}
//    BigInteger bi2 = BigInteger.valueOf(123L);
