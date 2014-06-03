package Exercise1;

import java.util.ArrayList;

public class largestPalindromeProduct {

	private static ArrayList<Integer> productOfThreeDigitIntegers;
	private static ArrayList<Integer> palindromeList;
	private static ArrayList<Integer> provenPalindromes;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateProducts();
		returnPalindromes();
		provenPalindromes.sort(null);
		for (Integer palindrome : getProvenPalindromes()) {
			System.out.println(palindrome);
		}
		}

	/**
	 * 
	 */
	/**
	 * Generates a set of products with all the integers that are 3-digit. 100->999
	 * 100*101 etc.
	 */
	private static void generateProducts() {
		setProductOfThreeDigitIntegers(new ArrayList<Integer>());
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				getProductOfThreeDigitIntegers().add(i*j);
			}
			}
	}

	/**
	 * Gets the private field
	 * @return Returns the private arraylist of products
	 */
	private static ArrayList<Integer> getProductOfThreeDigitIntegers() {
		return productOfThreeDigitIntegers;
	}
	
	private static void returnPalindromes() {
		setProvenPalindromes(new ArrayList<Integer>());
		for (Integer integer : getProductOfThreeDigitIntegers()) {
			if (isItPalindrome(integer)) {
				getProvenPalindromes().add(integer);
			}
		}
		
	}
	
	private static boolean isItPalindrome(Integer integer) {
		Integer reversedInt = reverseInt(integer);
		if (reversedInt.equals(integer)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param integer 
	 * @return 
	 * 
	 */
	private static Integer reverseInt(Integer n) {
			StringBuilder stringBuilderWhichReverses = new StringBuilder(Integer.toString(n)).reverse();
//			Lastly, lets convert that stringbuilder to string
			String stringReversed = stringBuilderWhichReverses.toString();
			String reversableString = new String(stringReversed);
//			Then lets return it as an integer
			return Integer.parseInt(reversableString);
	}

	private static void setProductOfThreeDigitIntegers(
			ArrayList<Integer> productOfThreeDigitIntegers) {
		largestPalindromeProduct.productOfThreeDigitIntegers = productOfThreeDigitIntegers;
	}

	private static ArrayList<Integer> getProvenPalindromes() {
		return provenPalindromes;
	}

	private static void setProvenPalindromes(ArrayList<Integer> provenPalindromes) {
		largestPalindromeProduct.provenPalindromes = provenPalindromes;
	}
	}
