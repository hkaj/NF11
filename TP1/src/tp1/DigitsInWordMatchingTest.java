package tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class DigitsInWordMatchingTest {
	protected Matching matching = new DigitsInWordMatching();

	@Test
	public void test_only_number_should_not_match() {
		assertFalse(matching.doesMatch("42"));
	}
	
	@Test
	public void test_only_word_should_not_match() {
		assertFalse(matching.doesMatch("word"));
	}
	
	@Test
	public void test_digits_at_the_beggining_should_not_match() {
		assertFalse(matching.doesMatch("42word"));
	}
	
	@Test
	public void test_digits_at_the_end_of_the_word_should_not_match() {
		assertFalse(matching.doesMatch("word42"));
	}
	
	@Test
	public void test_digits_inside_word_should_match() {
		assertTrue(matching.doesMatch("Ax25By"));
	}
}
