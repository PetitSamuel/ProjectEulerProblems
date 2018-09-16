import java.math.BigInteger;
public class p016 {
	public static void main(String[] args) {
		BigInteger number = BigInteger.ONE;
		number = number.add(BigInteger.valueOf(1));
		for(int i = 1; i < 1000; i++)
		{
			number = number.multiply(BigInteger.valueOf(2));
		}
		String textNumber = number.toString();
		int sum = 0;
		for(int i = 0; i < textNumber.length(); i++)
		{
			sum += Character.getNumericValue(textNumber.charAt(i));
		}
		System.out.println(sum);
	}
}
