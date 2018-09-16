
public class DivisibleTriangleNumber {

	public static void main(String[] args) {
		int triangle = 0;
		int count = 0;
		while(divisor(triangle) <= 500)
		{
			count++;
			triangle += count;
		}
		System.out.println(triangle);
	}
	
	public static int divisor(int n) {
		int count = 0;
		int end =  (int) Math.sqrt(n);
		for (int i = 1; i < end; i++) {
			if (n % i == 0)
				count += 2;
		}
		if (end * end == n)  // Perfect square
			count++;
		return count;
	}
}
