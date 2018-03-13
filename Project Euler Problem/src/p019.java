import java.util.Scanner;
import javax.swing.JOptionPane;
public class p019 {

		//using constant values from 'ValideDate.java' program on blackboard
		public static final int DAYS_IN_APRIL_JUNE_SEPT_NOV = 30;
		public static final int DAYS_IN_FEBRUARY_NORMALLY = 28;
		public static final int DAYS_IN_FEBRUARY_IN_LEAP_YEAR = 29;
		public static final int DAYS_IN_MOST_MONTHS = 31;
		public static final int NUMBER_OF_MONTHS = 12;
		public static final String ERROR_MESSAGE = "Error, the input is not valid";
		public static void main(String[] args) {
			int count = 0;
			for(int year = 1901; year <= 2000; year++)
			{
				for(int month = 1; month <= 12; month++)
				{
					if(getDayOfTheWeek(1, month, year) == "Sunday")
					{
						count++;
					}
				}
			}
			System.out.println(count);
	}
		
	public static String getDayOfTheWeek(int day, int month, int year)
	{
	//as said in the formula : if the month is Jan or Feb, Y=Y-1
		String dayString = "";
		if(month == 1 || month == 2)
		{
			year -= 1;
		}
	//loop to get last two digits of the year given
		int lastTwoDigitsYear = year;
		while(lastTwoDigitsYear > 99)
		{
			lastTwoDigitsYear = lastTwoDigitsYear % 100;
		};
	//loop to get first two digits of the year given	
		int firstTwoYearDigit = year;
		while( firstTwoYearDigit > 99)
		{
			firstTwoYearDigit = firstTwoYearDigit / 10;
		}
	//uses the formula given to get a number from 0 to 7, each of which corresponds to a specific day
		int dayOfWeek = (int)Math.abs((day + Math.floor(2.6 * (((month + 9) % 12) + 1) - 0.2) + lastTwoDigitsYear 
											+ Math.floor(lastTwoDigitsYear/4) + Math.floor(firstTwoYearDigit/4) - 2*firstTwoYearDigit)% 7);
	//assigns the Characters of the Day to the returned string
		switch(dayOfWeek)
		{
		case 1:
			dayString = "Monday";
			break;
		case 2:
			dayString = "Tuesday";
			break;
		case 3:
			dayString = "Wednesday";
			break;
		case 4:
			dayString = "Thursday";
			break;
		case 5:
			dayString = "Friday";
			break;
		case 6:
			dayString = "Saturday";
			break;
		default:
			dayString = "Sunday";
			break;
		}
		return dayString;
	}

	}

