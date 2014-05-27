package tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import tdd.exception.EmptyListException;

public class MaiorMenorTest {
	
	private final static int[] NUMBER_LIST_ANY_ORDER = {10, 3, 22, 1};
	private final static int[] NUMBER_LIST_ASC_ORDER = {1, 2, 3, 4};
	private final static int[] NUMBER_LIST_DESC_ORDER = {4, 3, 2, 1};
	private final static int[] NUMBER_LIST_EMPTY = {};

	private MaiorMenor maiorMenor;
	
	@Before
	public void setUp() {
		this.maiorMenor = new MaiorMenor();
	}
	
	@Test
	public void deveRetornarOMenorValorDaLista() throws EmptyListException {
		assertEquals(1, maiorMenor.getMenor(NUMBER_LIST_ANY_ORDER));
	}
	
	@Test
	public void deveRetornarOMenorValorDaListaCrescente() throws EmptyListException {
		assertEquals(1, maiorMenor.getMenor(NUMBER_LIST_ASC_ORDER));
	}
	
	@Test
	public void deveRetornarOMenorValorDaListaDecrescente() throws EmptyListException {
		assertEquals(1, maiorMenor.getMenor(NUMBER_LIST_DESC_ORDER));
	}
	
	@Test(expected = EmptyListException.class)
	public void deveRetornarOMenorValorDaListaVazia() throws EmptyListException {
		assertEquals(1, maiorMenor.getMenor(NUMBER_LIST_EMPTY));
	}
	
	@Test
	public void deveRetornarOMaiorValorDaLista() throws EmptyListException {
		assertEquals(22, maiorMenor.getMaior(NUMBER_LIST_ANY_ORDER));
	}
	
	@Test
	public void deveRetornarOMaiorValorDaListaCrescente() throws EmptyListException {
		assertEquals(4, maiorMenor.getMaior(NUMBER_LIST_ASC_ORDER));
	}
	
	@Test
	public void deveRetornarOMaiorValorDaListaDecrescente() throws EmptyListException {
		assertEquals(4, maiorMenor.getMaior(NUMBER_LIST_DESC_ORDER));
	}
	
	@Test(expected = EmptyListException.class)
	public void deveRetornarOMaiorValorDaListaVazia() throws EmptyListException {
		assertEquals(1, maiorMenor.getMaior(NUMBER_LIST_EMPTY));
	}
}
