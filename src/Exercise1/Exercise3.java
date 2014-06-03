package Exercise1;

import java.util.ArrayList;
import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

public class Exercise3 {
	private static HashMap<Integer, Integer> listOfPrimeIntegers;
	private static Boolean dividiblebySomething = false;
	private static Integer primInteger;
	public static void main(String[] args) {
		listOfPrimeIntegers = generateListOfPrimes(1000000);
		System.out.println(listOfPrimeIntegers);
		}
	private HashMap<Integer, Integer> getListOfPrimeIntegers() {
		return listOfPrimeIntegers;
	}
	private void setListOfPrimeIntegers(HashMap<Integer, Integer> listOfPrimeIntegers) {
		Exercise3.listOfPrimeIntegers = listOfPrimeIntegers;
	}
	private void addToTheListOfIntegers(Integer key,Integer Prime) {
		Exercise3.listOfPrimeIntegers.put(key,Prime);
		
	}
	private static HashMap<Integer, Integer> generateListOfPrimes(Integer NumberofPrimes) {
		HashMap<Integer, Integer> HashMapofPrimes = new HashMap<Integer,Integer>();
		HashMapofPrimes.put(1,2);
		HashMapofPrimes.put(2,3);
		for (int i = 4; i < NumberofPrimes; i++) {
			setDividibleBySomething(false);
			primInteger = i;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				
				if (i % j == 0) {
					setDividibleBySomething(true);
					
				}
			}
			if (getDividiblebySomething() == false) {
				HashMapofPrimes.put(HashMapofPrimes.size()+1,primInteger);
			}
			
		}
		return HashMapofPrimes;
		}
	private static Boolean getDividiblebySomething() {
		return dividiblebySomething;
	}
	private static void setDividibleBySomething(Boolean dividiblebySomething) {
		Exercise3.dividiblebySomething = dividiblebySomething;
	}
		
	}
