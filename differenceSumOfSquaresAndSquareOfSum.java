
public class differenceSumOfSquaresAndSquareOfSum {

	public static void main(String[] args) {

		int sqrSum = getSquareOfSum(100);
		int sumOfSqr = getSumOfSquare(100);
		System.out.println(sqrSum - sumOfSqr);
	}
	
	public static int getSquareOfSum(int index)
	{
		int sqrofSum = ((index * (index+1)/2));

		return (sqrofSum * sqrofSum) ;
	}
	public static int getSumOfSquare(int index)
	{
		int sumofsqr = ((index * (index + 1) * (2 * index + 1))/6);
		return sumofsqr;
	}

}
