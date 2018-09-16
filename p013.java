public class p013 {
	public static void main(String[] args) {
		long length = 0;
		int result = 0;
		int count = 0;
		for(int j = 10; j < 1000000; j++)
		{
			long i = j;
			while (i != 1)
			{
				if (i % 2 == 0)
				{
					i /= 2;
				}
				else
				{
					i = (3 * i) + 1;
				}
				count++;
			}
				if(count > length)
				{
					length = count;
					result = j;
				}
			count = 0;
		}	 
		System.out.println(result+" with chain size: "+ length);
	}
}