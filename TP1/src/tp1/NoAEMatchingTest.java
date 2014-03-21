package tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class NoAEMatchingTest {
	Matching matching = new NoAEMatching();
		
	@Test
	public void test_word_with_a_a_should_not_match() {
		assertFalse(matching.doesMatch("basile"));
	}

	@Test
	public void test_word_without_should_match() {
		assertTrue(matching.doesMatch("lqslsqldom"));
	}
	
	
}
