package Exercise1;

public class Exercise1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int summa = 0;
//		If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
//		Find the sum of all the multiples of 3 or 5 below 1000.
		for (int i = 0; i < 1000; i++) {
//			Lets check until i hits 1000, 1000 is not included
			if (i % 5 == 0) {
//				Modulo of 50
				summa+=i;
			} else if (i % 3 == 0) {
//				Modulo of 3
				summa+=i;
			}
		}
		System.out.println(summa);

	}

}
