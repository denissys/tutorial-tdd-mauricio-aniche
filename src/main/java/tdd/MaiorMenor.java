package tdd;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;
import tdd.exception.EmptyListException;

public class MaiorMenor {

	public int getMenor(int[] numeros) throws EmptyListException {
		int menor = MAX_VALUE;
		validList(numeros);
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		return menor;
	}

	public int getMaior(int[] numeros) throws EmptyListException {
		int maior = MIN_VALUE;
		validList(numeros);
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		return maior;
	}
	
	private void validList(int[] numeros) throws EmptyListException {
		if(numeros.length == 0) {
			throw new EmptyListException("A lista não deve estar vazia.");
		}
	}
}