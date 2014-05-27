package tdd;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import tdd.exception.EmptyListException;

public class HighestLowestValue {

	public int getLowest(int[] number) throws EmptyListException {
		int lowest = MAX_VALUE;
		validList(number);
		
		for (int i = 0; i < number.length; i++) {
			if(number[i] < lowest) {
				lowest = number[i];
			}
		}
		return lowest;
	}

	public int getHighest(int[] number) throws EmptyListException {
		int highest = MIN_VALUE;
		validList(number);
		
		for (int i = 0; i < number.length; i++) {
			if(number[i] > highest) {
				highest = number[i];
			}
		}
		return highest;
	}
	
	private void validList(int[] numeros) throws EmptyListException {
		if(numeros.length == 0) {
			throw new EmptyListException("The can be not empty.");
		}
	}
}