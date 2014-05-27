package tdd;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

import java.util.Arrays;

public abstract class MaiorMenor {

	private static int menor = MAX_VALUE;
	private static int maior = MIN_VALUE;

	public static int getMenor(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] < menor) {
				menor = numeros[i];
			}
		}
		return menor;
	}
	
	public static int getMaior(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		return maior;
	}
	
	public static void main(String[] args) {
		int[] numeros = {10, 3, 4, 20};
		System.out.println("Valores: " + Arrays.toString(numeros));
		System.out.println("O menor valor é: " + getMenor(numeros));
		System.out.println("O maior valor é: " + getMaior(numeros));
	}
}
