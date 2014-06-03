package Exercise1;

public class Exercise2 {

	public static void main(String[] args) {
		System.out.println(generateFibonacciSequence(1000000000));
	}

	/**
	 * 
	 */
	private static Integer generateFibonacciSequence(int pituus) {
		int sumOfEvenFibonacciSequenceIntegers = 0;
		int previousInteger = 1;
		int nextInteger = 2;
		int tmp;
		for (int i = 0; i < pituus; i++) {
			if (nextInteger < 4000000) {
				if (nextInteger % 2 == 0) {
					sumOfEvenFibonacciSequenceIntegers+=nextInteger;
				}
				tmp = nextInteger;
				nextInteger = previousInteger + nextInteger;
				previousInteger = tmp;
							}
			else {
				break;
			}
		}
		return sumOfEvenFibonacciSequenceIntegers;
	}

}
