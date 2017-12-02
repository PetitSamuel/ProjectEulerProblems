
public class EvenFibonacci {

	public static void main(String[] args) {
		int fibonacci = 1;
		int fiboLssOne = 1;
		int s = 0;
		while (fibonacci < 4000000) {
			int tmp = fibonacci;
			fibonacci += fiboLssOne;
			fiboLssOne = tmp;

			if (fibonacci % 2 == 0) {
				s += fibonacci;
			}
		}
		System.out.println(s);
	}
}