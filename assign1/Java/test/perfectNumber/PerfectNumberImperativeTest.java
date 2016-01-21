package perfectNumber;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PerfectNumberImperativeTest {

	PerfectNumberImperative perfectNumber;

	@Before
	public void setUp() {
		perfectNumber =  new PerfectNumberImperative();
	}

	@Test
	public void Canary() {
		assertTrue(true);
	}

	@Test
	public void isPerfectWith0() {
		assertFalse(perfectNumber.isPerfect(0));
	}

	@Test
	public void isPerfectWith1() {
		assertFalse(perfectNumber.isPerfect(1));
	}

	@Test
	public void isPerfectWithNegative() {
		assertFalse(perfectNumber.isPerfect(-2));
	}

	@Test
	public void isPerfectWith6() {
		assertTrue(perfectNumber.isPerfect(6));
	}

	@Test
	public void isPerfectWith28() {
		assertTrue(perfectNumber.isPerfect(28));
	}

	@Test
	public void isPerfectWith496() {
		assertTrue(perfectNumber.isPerfect(496));
	}
}
