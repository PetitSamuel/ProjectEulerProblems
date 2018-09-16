
public class GridNumbers {

	public static int [] ROW1 = {8, 02, 22, 97, 38, 15, 0, 40, 0, 75, 4, 5, 7, 78, 52, 12, 50, 77, 91, 8};
	public static int [] ROW2 = {49, 49, 99, 40, 17, 81, 18, 57, 60, 87, 17, 40, 98, 43, 69, 48, 04, 56, 62, 0};
	public static int [] ROW3 = {81, 49, 31, 73, 55, 79, 14, 29, 93, 71, 40, 67, 53, 88, 30, 3, 49, 13, 36, 65};
	public static int [] ROW4 = {52, 70, 95, 23, 4, 60, 11, 42, 69, 24, 68, 56, 1, 32, 56, 71, 37, 2, 36, 91};
	public static int [] ROW5 = {22, 31, 16, 71, 51, 67, 63, 89, 41, 92, 36, 54, 22, 40, 40, 28, 66, 33, 13, 80};
	public static int [] ROW6 = {24, 47, 32, 60, 99, 3, 45, 2, 44, 75, 33, 53, 78, 36, 84, 20, 35, 17, 12, 50};
	public static int [] ROW7 = {32, 98, 81, 28, 64, 23, 67, 10, 26, 38, 40, 67, 59, 54, 70, 66, 18, 38, 64, 70};
	public static int [] ROW8 = {67, 26, 20, 68, 2, 62, 12, 20, 95, 63, 94, 39, 63, 8, 40, 91, 66, 49, 94, 21};
	public static int [] ROW9 = {24, 55, 58, 5, 66, 73, 99, 26, 97, 17, 78, 78, 96, 83, 14, 88, 34, 89, 63, 72};
	public static int [] ROW10 = {21, 36, 23, 9, 75, 0, 76, 44, 20, 45, 35, 14, 0, 61, 33, 97, 34, 31, 33, 95};
	public static int [] ROW11= {78, 17, 53, 28, 22, 75, 31, 67, 15, 94, 3, 80, 4, 62, 16, 14, 9, 53, 56, 92};
	public static int [] ROW12 = {16, 39, 5, 42, 96, 35, 31, 47, 55, 58, 88, 24, 0, 17, 54, 24, 36, 29, 85, 57};
	public static int [] ROW13 = {86, 56, 0, 48, 35, 71, 89, 7, 5, 44, 44, 37, 44, 60, 21, 58, 51, 54, 17, 58};
	public static int [] ROW14 = {19, 80, 81, 68, 5, 94, 47, 69, 28, 73, 92, 13, 86, 52, 17, 77, 4, 89, 55, 40};
	public static int [] ROW15 = {4, 52, 8, 83, 97, 35, 99, 16, 7, 97, 57, 32, 16, 26, 26, 79, 33, 27, 98, 66};
	public static int [] ROW16 = {88, 36, 68, 87, 57, 62, 20, 72, 3, 46, 33, 67, 46, 55, 12, 32, 63, 93, 53, 69};
	public static int [] ROW17 = {4, 42, 16, 73, 38, 25, 39, 11, 24, 94, 72, 18, 8, 46, 29, 32, 40, 62, 76, 36};
	public static int [] ROW18 = {20, 69, 36, 41, 72, 30, 23, 88, 34, 62, 99, 69, 82, 67, 59, 85, 74, 4, 36, 16};
	public static int [] ROW19 = {20, 73, 35, 29, 78, 31, 90, 1, 74, 31, 49, 71, 48, 86, 81, 16, 23, 57, 5, 54};
	public static int [] ROW20 = {1, 70, 54, 71, 83, 51, 54, 69, 16, 92, 33, 48, 61, 43, 52, 1, 89, 19, 67, 48};

	public static void main(String[] args) {
		int [][] numbers = {ROW1, ROW2, ROW3, ROW4, ROW5, ROW6, ROW7, ROW8, ROW9, ROW10, ROW11, ROW12, ROW13, ROW14, ROW15, ROW16, ROW17, ROW18, ROW19, ROW20};
		
		int max = getMaxLinear(numbers);
		int tmp = getMaxDiagonal(numbers);
		
		if(tmp > max)
		{
			max = tmp;
		}
		System.out.println(max);
	}

	public static int getMaxLinear(int [][] numbers)
	{
		int max = 0;
		for(int i = 0; i < numbers[0].length; i++)
		{
			for(int j = 0; j < numbers.length - 3; j++)
			{
				int product = 1;
				int product2 = 1;
				for(int a = 0; a < 4; a++)
				{
					//product is horizontal, product2 is in the same line(left/right)
					product *= numbers[j+a][i];
					product2 *= numbers[i][j+a];

				}
				if(product > max || product2 > max)
				{
					if(product > product2)
					{
						max = product;
					}
					else
					{
						max = product2;
					}
				}		
			}
		}
		return max;
	}
	
	public static int getMaxDiagonal(int [][] numbers)
	{
		//diagonals from left to right
		int max = 0;
		for(int i = 0; i < numbers[0].length - 3; i++)
		{
			for(int j = 0; j < numbers.length - 3; j++)
			{
				int product = 1;
				for(int a = 0; a < 4; a++)
				{
					product *= numbers[i+a][j+a];
				}
				if(product > max)
				{
					max = product;
				}
			}
		}
		// diagonals from right to left
		for(int i = 3; i < 20; i++)
		{
			for(int j = 0; j < numbers.length - 3; j++)
			{
				int product = numbers[i][j] * numbers[i-1][j+1] * numbers[i-2][j+2] * numbers[i-3][j+3];
				if(product > max)
				{
					max = product;
				}
			}
		}
		return max;
	}
}
