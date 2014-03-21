package tp1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IntegerMatchingTest {

	protected Matching integerMatching = new IntegerMatching();
	
	@Test
	public void test_positive_integer_should_match() {
		assertTrue(integerMatching.doesMatch("42"));
	}
	
	@Test
	public void test_negative_integer_with_minus_should_match() {
		assertTrue(integerMatching.doesMatch("-42"));
	}
	
	@Test
	public void test_positive_integer_with_leading_zero_should_not_match() {
		assertFalse(integerMatching.doesMatch("0042"));
	}
	
	@Test
	public void test_negative_integer_with_leading_zero_should_not_match() {
		assertFalse(integerMatching.doesMatch("-0042"));
	}
	
	@Test
	public void test_text_should_not_match() {
		assertFalse(integerMatching.doesMatch("lalala"));
	}
}
