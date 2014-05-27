package tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaiorMenorTest {
	
	private final static int[] NUMEROS = {10, 3, 22, 1};

	@Test
	public void deveRetornarOMenorValorDaLista() {
		assertEquals(1, MaiorMenor.getMenor(NUMEROS));
	}
	
	@Test
	public void deveRetornarOMaiorValorDaLista() {
		assertEquals(22, MaiorMenor.getMaior(NUMEROS));
	}

}
