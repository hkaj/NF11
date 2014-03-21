package tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoPartsMatchingTest {
	protected Matching matching = new TwoPartsMatching();

	@Test
	public void test_word_with_two_parts_at_2_letters_should_match() {
		assertTrue(matching.doesMatch("abab"));
		assertTrue(matching.doesMatch("aebaeb"));
		assertTrue(matching.doesMatch("aaaabaaaab"));
	}

	@Test
	public void test_word_without_two_parts_should_not_match() {
		assertFalse(matching.doesMatch("42"));
	}
	
	@Test
	public void test_word_with_two_too_long_parts_should_not_match() {
		assertFalse(matching.doesMatch("azertyuiopazertyuiop"));
	}

	@Test
	public void test_word_with_two_too_short_parts_should_not_match() {
		assertFalse(matching.doesMatch("44"));
	}
}
