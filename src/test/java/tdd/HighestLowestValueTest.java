package tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import tdd.exception.EmptyListException;

public class HighestLowestValueTest {
	
	private final static int[] NUMBER_LIST_ANY_ORDER = {10, 3, 22, 1};
	private final static int[] NUMBER_LIST_ASC_ORDER = {1, 2, 3, 4};
	private final static int[] NUMBER_LIST_DESC_ORDER = {4, 3, 2, 1};
	private final static int[] NUMBER_LIST_EMPTY = {};

	private HighestLowestValue highestLowestValue;
	
	@Before
	public void setUp() {
		this.highestLowestValue = new HighestLowestValue();
	}
	
	@Test
	public void shouldReturnLowestValueOfList() throws EmptyListException {
		assertEquals(1, highestLowestValue.getLowest(NUMBER_LIST_ANY_ORDER));
	}
	
	@Test
	public void shouldReturnLowestValueOfAscList() throws EmptyListException {
		assertEquals(1, highestLowestValue.getLowest(NUMBER_LIST_ASC_ORDER));
	}
	
	@Test
	public void shouldReturnLowestValueOfDescList() throws EmptyListException {
		assertEquals(1, highestLowestValue.getLowest(NUMBER_LIST_DESC_ORDER));
	}
	
	@Test(expected = EmptyListException.class)
	public void shouldReturnExceptionOnLowestWhenEmptyList() throws EmptyListException {
		assertEquals(1, highestLowestValue.getLowest(NUMBER_LIST_EMPTY));
	}
	
	@Test
	public void shouldReturnHighestValueOfList() throws EmptyListException {
		assertEquals(22, highestLowestValue.getHighest(NUMBER_LIST_ANY_ORDER));
	}
	
	@Test
	public void shouldReturnHighestValueOfAscList() throws EmptyListException {
		assertEquals(4, highestLowestValue.getHighest(NUMBER_LIST_ASC_ORDER));
	}
	
	@Test
	public void shouldReturnHighestValueOfDescList() throws EmptyListException {
		assertEquals(4, highestLowestValue.getHighest(NUMBER_LIST_DESC_ORDER));
	}
	
	@Test(expected = EmptyListException.class)
	public void shouldReturnExceptionOnHighestWhenEmptyList() throws EmptyListException {
		assertEquals(1, highestLowestValue.getHighest(NUMBER_LIST_EMPTY));
	}
}
