package Exercise1;

import java.math.BigInteger;

public class fibonacci1000Digit {

	private static BigInteger reallyBigInteger;

	public static void main(String[] args) {
		reallyBigInteger = new BigInteger(generateNDigitStringNumber(1000));
		findTheBiggest();
		
	}
	private static void findTheBiggest() {
//		The first numbers of the Fibonacci sequence are 1 and 2
		BigInteger FirstInteger = BigInteger.valueOf(1);
		BigInteger SecondInteger = BigInteger.valueOf(2);
		BigInteger TemporaryInteger = BigInteger.valueOf(0);
		int i = 3;
//		Using compareTo to check if SecondInteger is numerically smaller than reallyBigInteger
		for (i = 3; SecondInteger.compareTo(reallyBigInteger) < 0; i++) {
			TemporaryInteger = FirstInteger.add(SecondInteger);
			FirstInteger = SecondInteger;
			SecondInteger = TemporaryInteger;
			
		}
		System.out.println(i);
	}

	/**
	 * Returns a String which is a number of format 1*10^n
	 * @param n Number of zeros to generate for the String
	 * @return
	 */
	private static String generateNDigitStringNumber(Integer n) {
		StringBuilder sb = new StringBuilder(n);
		sb.append('1');
//		1 is already given so lets minus n by 1
		n -= 1;
		for (int i = 0; i < n; i++) {
			sb.append('0');
		}
		return sb.toString();
	}

}
