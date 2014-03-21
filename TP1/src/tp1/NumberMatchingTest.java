package tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberMatchingTest {
	protected Matching matching = new NumberMatching();
	
	@Test
	public void test_number_without_dot_should_not_match() {
		assertFalse(matching.doesMatch("42"));
	}
	
	@Test
	public void test_number_with_dot_and_no_decimal_part_should_not_match() {
		assertFalse(matching.doesMatch("42."));
	}
	
	@Test
	public void test_number_with_dot_and_null_decimal_part_should_not_match() {
		assertFalse(matching.doesMatch("42.0"));
		assertFalse(matching.doesMatch("42.00"));
	}	
	
	@Test
	public void test_number_with_dot_and_decimal_part_should_match() {
		assertTrue(matching.doesMatch("42.42"));
	}
	
	@Test
	public void test_number_with_leading_zeros_and_decimal_part_should_match() {
		assertTrue(matching.doesMatch("042.42"));
	}
	
	@Test
	public void test_negative_number_with_dot_and_decimal_part_should_match() {
		assertTrue(matching.doesMatch("-42.42"));
	}
	
}

