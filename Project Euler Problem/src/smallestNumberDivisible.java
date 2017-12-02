
public class smallestNumberDivisible {

	public static void main(String[] args) {
		for(int count = 20; count < Integer.MAX_VALUE && count > 0; count ++)
		{
			boolean finddiv = true;
			for(int div = 2; div < 20 && finddiv; div++)
			{
				if(count % div != 0)
				{
					finddiv = false;
				}
			}
			if(finddiv)
			{
				System.out.println(count);
				count = Integer.MAX_VALUE;
			}
		}
	}
}
