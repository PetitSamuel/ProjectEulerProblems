
public class p017 {
	public static final String [] NUMBERS = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven","twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
	public static final String [] NUMBERS_TENS = {"zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty","ninety"};
	public static final String NUMBER_HUNDRED = "hundred";
	public static final String NUMBER_THOUSAND = "thousand";

	public static void main(String[] args) {
		String total = "";
		for(int i = 1; i <= 1000; i++)
		{
			total += getText(i);
		}
		System.out.println(total.length());
	}
	
	public static String getText(int i)
	{
		if(i <= 20 && i > 0)
		{
			return NUMBERS[i];
		}
		else if(i > 20 && i < 100)
		{
			String text = "";
			text += NUMBERS_TENS[i/10];
			if(i%10 != 0)
			{
				text += NUMBERS[i%10];
			}
			return text;
		}
		else if(i >= 100 && i < 1000)
		{
			String text = "";
			text = NUMBERS[i/100] + NUMBER_HUNDRED;
			int tmp = i - (i/100 * 100);
			if(tmp <= 20 && tmp > 0)
			{
				text += "and" + NUMBERS[tmp];
			}
			else if(tmp > 20 && tmp < 100)
			{
				text +="and" + NUMBERS_TENS[tmp/10];
				if(tmp%10 != 0)
				{
					text += NUMBERS[tmp%10];
				}
			}
			return text;
		}
		else if(i == 1000)
		{
			return NUMBERS[1] + NUMBER_THOUSAND;	
		}
		else
		{
			return "";
		}
	}
}
