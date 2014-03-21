package tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class LeMatchingTest {
	protected Matching matching = new LeMatching();
	
	@Test
	public void test_word_without_le_should_not_match() {
		assertFalse(matching.doesMatch("Word"));
	}
	
	@Test
	public void test_only_le_word_should_not_match() {
		assertFalse(matching.doesMatch("le"));
	}
	
	@Test
	public void test_word_with_le_should_match() {
		assertTrue(matching.doesMatch("parlement"));
	}
	
	@Test
	public void test_word_with_multiple_le_should_match() {
		assertTrue(matching.doesMatch("parlementlement"));
	}
}
